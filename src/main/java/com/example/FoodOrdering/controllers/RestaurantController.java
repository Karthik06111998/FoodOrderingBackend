package com.example.FoodOrdering.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodOrdering.data.Restaurant;
import com.example.FoodOrdering.data.User;
import com.example.FoodOrdering.queries.RestaurantQueries;
import com.example.FoodOrdering.queries.UserQueries;
import com.example.FoodOrdering.rowmappers.RestaurantRowMapper;
import com.example.FoodOrdering.rowmappers.UserRowMapper;

@RestController
public class RestaurantController {
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	@PostMapping("/restaurant/signup")
	public int requestSignup(@RequestBody Restaurant restaurant) {
		System.out.println(restaurant);
		try {
			return jdbcTemplate.update(RestaurantQueries.ADD_RESTAURANT,new Object[] {
					restaurant.getName(), restaurant.getUsername(),restaurant.getPassword(),restaurant.getEmail(),
					restaurant.getLocation(), restaurant.getPicture(), restaurant.getUsername()
			});
		}catch(DataIntegrityViolationException e) {
			System.out.println(e);
			return -1;
		}
	}
	@PostMapping("/restaurant/login")
	public List<Restaurant> requestLogin(@RequestBody Restaurant restaurant) {
		
		return jdbcTemplate.query(RestaurantQueries.VALIDATE_RESTAURANT, new Object[] {
				restaurant.getUsername(), restaurant.getPassword()
		}, new RestaurantRowMapper());		
	}
	
}
