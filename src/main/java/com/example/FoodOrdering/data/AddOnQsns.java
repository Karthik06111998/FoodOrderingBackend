package com.example.FoodOrdering.data;

public class AddOnQsns {
	private int id;
	private String Question;
	private double AddOnPrice;
	private boolean isExclusive;
	public boolean isExclusive() {
		return isExclusive;
	}
	public void setExclusive(boolean isExclusive) {
		this.isExclusive = isExclusive;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public double getAddOnPrice() {
		return AddOnPrice;
	}
	public void setAddOnPrice(double addOnPrice) {
		AddOnPrice = addOnPrice;
	}

}
