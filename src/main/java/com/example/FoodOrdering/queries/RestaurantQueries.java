package com.example.FoodOrdering.queries;

public class RestaurantQueries {
	public static String GET_RESTAURANTS="SELECT RId, RName, REmail, RLocation, ST_X(RGeoLocation) as RLat, ST_Y(RGeoLocation) as RLong,RPicture, RIsOpen, RRating"
			+ " FROM restaurant ";
	
	public static String ADD_RESTAURANT = "INSERT INTO restaurant( RName, RUserName, RPassword, REmail, RLocation, RPicture) "
			+ "SELECT * from ( SELECT  ? as RName, ? as RUserName, ? as RPassword, ? as REmail, ? as RLocation, ? as RPicture) "
			+ "as temp where not exists (SELECT RUserName  FROM restaurant WHERE RUserName=?) LIMIT 1;";
	
	public static String VALIDATE_RESTAURANT = "SELECT RId, RName, REmail, RLocation, ST_X(RGeoLocation) as RLat, ST_Y(RGeoLocation) as RLong,RPicture, RIsOpen, RRating"
			+ " FROM restaurant where RUserName = ? and RPassword = ? ";
}
