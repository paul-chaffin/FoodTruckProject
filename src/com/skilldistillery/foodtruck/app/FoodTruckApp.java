package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruck[] foodTrucks = new FoodTruck[5];
		FoodTruckApp app = new FoodTruckApp();
		app.addTruck(foodTrucks, app);

	}

	public void addTruck(FoodTruck[] foodTrucks, FoodTruckApp app) {
		int counter = 0;
		String truckName = "";
		String cuisine = "";
		double rating = 0.0;
		while (counter < 5) {

			System.out.print("Enter the truck name (or \"quit\"): ");
			truckName = kb.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			} else {
				System.out.print("What kind of food does the truck sell?: ");
				cuisine = kb.nextLine();
				System.out.print("Enter a rating from 1.0 to 5.0: ");
				rating = kb.nextDouble();
				// TODO could below be better?
				foodTrucks[counter] = new FoodTruck(truckName, cuisine, rating);
				System.out.println(foodTrucks[counter].getNextTruckId());
				counter++;
				kb.nextLine();
			}

		}
		app.menuLoop(foodTrucks, app, counter);
	}

	public void menuLoop(FoodTruck[] foodTrucks, FoodTruckApp app, int counter) {
		int count = counter;
		while (true) {
			String choice = "";
			System.out.println("-------Main Menu------");
			System.out.println("1. List Food Trucks");
			System.out.println("2. Show Average Rating");
			System.out.println("3. Show Highest Rating");
			System.out.println("");
			System.out.println("       Q to quit      ");
			System.out.println("----------------------");
			System.out.println(" > ");
			choice = kb.next();
			kb.nextLine();
			if (choice.equalsIgnoreCase("q")) {
				kb.close();
				System.exit(0);
			} else if (choice.equals("1")) {
				if (count == 0) {
					System.out.println("\tNothing to display, please add some trucks!\n");
				} else {
					for (int i = 0; i < count; i++) {
						System.out.println(foodTrucks[i].toString() + "\n");
					}
				}
			} else if (choice.equals("2")) {
				// TODO rounding is incorrect
				System.out.println("\tThe average rating of all " + count + " food trucks is "
						+ Math.round(foodTrucks[0].getAverage()));
			} else if (choice.equals("3")) {
				FoodTruck highest = null;
				double rating = 0;
				for (int i = 0; i < count; i++) {
					if (foodTrucks[i].getRating() > rating) {
						rating = foodTrucks[i].getRating();
						highest = foodTrucks[i];
					}
				}
				System.out.println("\t" + highest.toString());
			}
		}

	}
}