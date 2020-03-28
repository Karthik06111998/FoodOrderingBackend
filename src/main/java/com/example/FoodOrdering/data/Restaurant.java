package com.example.FoodOrdering.data;

public class Restaurant {
	private int id;
	private String Name;
	private String Username;
	private String Password;
	private String Email;
	private String Picture;
	private String Location;
	private double GeoLocationX;
	private double GeoLocationY;
	private boolean IsOpen;
	private double Rating;
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
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
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
	public boolean isIsOpen() {
		return IsOpen;
	}
	public void setIsOpen(boolean isOpen) {
		IsOpen = isOpen;
	}
	public double getRating() {
		return Rating;
	}
	public void setRating(double rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", Name=" + Name + ", Username=" + Username + ", Password=" + Password
				+ ", Email=" + Email + ", Picture=" + Picture + ", Location=" + Location + ", GeoLocationX="
				+ GeoLocationX + ", GeoLocationY=" + GeoLocationY + ", IsOpen=" + IsOpen + ", Rating=" + Rating + "]";
	}
	
	
	
}
