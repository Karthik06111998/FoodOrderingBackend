package com.example.FoodOrdering.queries;

public class FoodQueries {
	public static String GET_FOOD_BY_RID="Select * from Food where RId = ?";
	
	public static String GET_ADD_ONS_QSNS_OF_FOOD="select * from add_ons_qsns where FId=?";
	
}
