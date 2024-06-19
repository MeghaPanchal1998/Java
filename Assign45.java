package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign45 {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");

		System.out.println("Original ArrayList:");
		System.out.println(fruits);

		int indexToUpdate = 2;
		String newFruit = "Grapes";

		if (indexToUpdate >= 0 && indexToUpdate < fruits.size()) {
			fruits.set(indexToUpdate, newFruit);
			System.out.println("\nUpdated ArrayList:");
			System.out.println(fruits);
		} else {
			System.out.println("\nIndex out of bounds.");
		}
	}

}
