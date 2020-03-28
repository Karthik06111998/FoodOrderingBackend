package com.example.FoodOrdering.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.example.FoodOrdering.data.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u=new User();
		u.setId(rs.getInt("UId"));
		u.setName(rs.getString("UName"));
		u.setUsername(rs.getString("UUserName"));
		u.setPassword(rs.getString("UPassword"));
		u.setEmail(rs.getString("UEmail"));
		u.setPicture(rs.getString("UPicture"));
//		u.setGeoLocation(rs.getString(""));
		u.setGeoLocationX(rs.getDouble("ULat"));
		u.setGeoLocationY(rs.getDouble("ULong"));
		System.out.println(rs.getString("ULong"));
		return u;
	}

}
