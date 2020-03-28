package com.example.FoodOrdering.data;

import org.springframework.data.annotation.Id;

public class User {
	private int id;
	private String Name;
	private String Username;
	private String Password;
	private String Email;
	private String Picture;
	private double GeoLocationX;
	private double GeoLocationY;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public double getGeoLocationX() {
		return GeoLocationX;
	}
	public void setGeoLocationX(double geoLocationX) {
		GeoLocationX = geoLocationX;
	}
	public double getGeoLocationY() {
		return GeoLocationY;
	}
	public void setGeoLocationY(double geoLocationY) {
		GeoLocationY = geoLocationY;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", Username=" + Username + ", Password=" + Password + ", Email="
				+ Email + ", Picture=" + Picture + ", GeoLocationX=" + GeoLocationX + ", GeoLocationY=" + GeoLocationY
				+ "]";
	}
	
}
