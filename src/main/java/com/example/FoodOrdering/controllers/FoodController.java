package com.example.FoodOrdering.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodOrdering.data.Food;
import com.example.FoodOrdering.data.AddOnQsns;
import com.example.FoodOrdering.queries.FoodQueries;
import com.example.FoodOrdering.rowmappers.FoodRowMapper;

@RestController
public class FoodController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/food/listfoods")
	public List<Food> getFoodsOfRestaurant(@RequestBody Integer rId){
		List<Food> restaurantFoodData=jdbcTemplate.query(FoodQueries.GET_FOOD_BY_RID, new Object[] {rId},new FoodRowMapper());
		restaurantFoodData.forEach(food->{
			HashMap<Boolean, List<AddOnQsns>> addOnQsnsDetails=new HashMap<Boolean,List<AddOnQsns>>();
			jdbcTemplate.query(FoodQueries.GET_ADD_ONS_QSNS_OF_FOOD,new Object[] {
				food.getId()
				},
				new RowMapper<AddOnQsns>() {
					@Override
					public AddOnQsns mapRow(ResultSet rs, int rowNum) throws SQLException {
						AddOnQsns addOnQsns=new AddOnQsns();
						addOnQsns.setId(rs.getInt("AQId"));
						addOnQsns.setQuestion(rs.getString("AddOnQuestion"));
						addOnQsns.setExclusive(rs.getBoolean("isExclusive"));
						addOnQsns.setAddOnPrice(rs.getFloat("AddOnPrice"));
						if(addOnQsnsDetails.containsKey(addOnQsns.isExclusive())) {
							addOnQsnsDetails.get(addOnQsns.isExclusive()).add(addOnQsns);
						}else {
							List<AddOnQsns> list=new ArrayList<AddOnQsns>();
							list.add(addOnQsns);
							addOnQsnsDetails.put(addOnQsns.isExclusive(), list);
						}
						return null;
					}
				}
			);
			food.setAddOnQsnsDetails(addOnQsnsDetails);
		});
		return restaurantFoodData;
	}

}
