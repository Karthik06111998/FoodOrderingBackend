package com.example.FoodOrdering.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.FoodOrdering.data.Restaurant;

public class RestaurantRowMapper  implements RowMapper<Restaurant>  {

	@Override
	public Restaurant mapRow(ResultSet rs, int rowNum) throws SQLException {
		Restaurant restaurant=new Restaurant();
		restaurant.setId(rs.getInt("RId"));
		restaurant.setName(rs.getString("RName"));
		restaurant.setEmail(rs.getString("REmail"));
		restaurant.setLocation(rs.getString("RLocation"));
		restaurant.setGeoLocationX(rs.getDouble("RLat"));
		restaurant.setGeoLocationY(rs.getDouble("RLong"));
		restaurant.setPicture(rs.getString("RPicture"));
		restaurant.setIsOpen(rs.getBoolean("RIsOpen"));
		restaurant.setRating(rs.getDouble("RRating"));
		return restaurant;
	}

	//Call got cut :((((
	//Add madro :))
	//cool
	
}
