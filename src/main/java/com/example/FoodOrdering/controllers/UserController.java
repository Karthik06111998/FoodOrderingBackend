package com.example.FoodOrdering.controllers;

import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.repository.core.NamedQueries;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterUtils;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodOrdering.data.Restaurant;
import com.example.FoodOrdering.data.*;
import com.example.FoodOrdering.queries.RestaurantQueries;
import com.example.FoodOrdering.queries.UserQueries;
import com.example.FoodOrdering.rowmappers.RestaurantRowMapper;
import com.example.FoodOrdering.rowmappers.UserRowMapper;

@RestController
public class UserController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	NamedParameterJdbcTemplate np;
	
	@PostMapping("/user/login")
	public List<User> requestLogin(@RequestBody User user) {
		
		return jdbcTemplate.query(UserQueries.VALIDATE_USER, new Object[] {
				user.getUsername(), user.getPassword()
		}, new UserRowMapper());		
	}
	
	@PostMapping("/user/signup")
	public int requestSignup(@RequestBody User user) {
		System.out.println(user);
		try {
			return jdbcTemplate.update(UserQueries.ADD_USER, new Object[] {
					user.getName(), user.getUsername(), user.getPassword(),user.getEmail(), user.getPicture()
					,user.getUsername()
			} );
		}
		catch (DataIntegrityViolationException e) {
			System.out.println(e);
			return -1;
		}
	}
	@PutMapping("/user/updatelocation")
	public void updateUserLocation(@RequestBody User user) {
		try {
			String sql=UserQueries.UPDATE_USER_LOCATION;
			sql=org.apache.commons.lang3.StringUtils.replace(sql, "[LAT]",""+ user.getGeoLocationX());
			sql=org.apache.commons.lang3.StringUtils.replace(sql, "[LONG]",""+ user.getGeoLocationY());
			System.out.println(jdbcTemplate.update(sql, new Object[] {
					 user.getId()
			}));
		}catch (Exception e) {
			throw e;
		}
	}
	
	@GetMapping("/user/restaurants")
	public List<Restaurant> getRestaurant(){
//		 Do some logic for getting nearest restaurants
		return jdbcTemplate.query(RestaurantQueries.GET_RESTAURANTS, new RestaurantRowMapper());
	}
	
	@GetMapping("/project/call")
	public int fun(@RequestBody Integer i) {
		System.out.println("i="+i);
		return i+1;
	}
	
	@PostMapping("/ABC")
	public ABC call(@RequestBody ABC abc) {
		System.out.println(abc.toString());
		abc.setName("New Abc");
		abc.setAge(abc.getAge()*10);
		return abc;
	}
	
}
