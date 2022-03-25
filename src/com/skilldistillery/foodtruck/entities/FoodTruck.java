package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 0000;
	private static int globalRatings;
	private int truckId;
	private String truckName;
	private String cuisine;
	private double rating;

	public FoodTruck() {

	}

	public FoodTruck(String truckName, String cuisine, double rating) {
		this.truckId = nextTruckId;
		this.truckName = truckName;
		this.cuisine = cuisine;
		this.rating = rating;

		globalRatings += this.rating;
		nextTruckId++;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNextTruckId() {

	}

	public int getGlobalRatings() {

	}

	public String toString() {

	}
}
