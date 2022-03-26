package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 0;
	private static double globalRatings;
	private int truckId;
	private String truckName;
	private String cuisine;
	private double rating;

	public FoodTruck() {

	}

	public FoodTruck(String truckName, String cuisine, double rating) {
		setTruckId();
		this.truckName = truckName;
		this.cuisine = cuisine;
		this.rating = rating;
		nextTruckId++;
		globalRatings += this.rating;
	}

	public int getTruckId() {
		return truckId;
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
		return nextTruckId;
	}

	private void setTruckId() {
		this.truckId = nextTruckId;
	}

	public double getAverage() {
		double result = globalRatings / nextTruckId;
		return result;
	}

	public String toString() {
		String result;
		this.truckName = getTruckName();
		result = "Food truck:\t" + this.truckName + "\n" + "Cuisine:\t" + this.cuisine + "\n" + "Rating:\t\t"
				+ this.rating + "\n";
		return result;
	}
}
