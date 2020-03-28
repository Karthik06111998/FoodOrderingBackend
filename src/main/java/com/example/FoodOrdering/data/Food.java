package com.example.FoodOrdering.data;

import java.util.HashMap;
import java.util.List;

public class Food {
	private int id;
	private int rid;
	private String Name;
	private double Price;
	private String Description;
	private String Picture;
	private HashMap<Boolean, List<AddOnQsns>> AddOnQsnsDetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public HashMap<Boolean, List<AddOnQsns>> getAddOnQsnsDetails() {
		return AddOnQsnsDetails;
	}
	public void setAddOnQsnsDetails(HashMap<Boolean, List<AddOnQsns>> addOnQsnsDetails) {
		AddOnQsnsDetails = addOnQsnsDetails;
	}

	
}
