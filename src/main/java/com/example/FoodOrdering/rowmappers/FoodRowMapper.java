package com.example.FoodOrdering.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.FoodOrdering.data.Food;

public class FoodRowMapper implements RowMapper<Food> {
	@Override
	public Food mapRow(ResultSet rs, int rowNum) throws SQLException {
		Food food=new Food();
		food.setId(rs.getInt("FId"));
		food.setRid(rs.getInt("RId"));
		food.setName(rs.getString("FName"));
		food.setDescription(rs.getString("FDescription"));
		food.setPrice(rs.getDouble("FPrice"));
		food.setPicture(rs.getString("FPicture"));
		return food;
	}
}
