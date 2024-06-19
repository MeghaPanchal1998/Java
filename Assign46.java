package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign46 {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");

		System.out.println("Original ArrayList:");
		System.out.println(fruits);

		int indexToRemove = 2;

		if (indexToRemove >= 0 && indexToRemove < fruits.size()) {
			fruits.remove(indexToRemove);
			System.out.println("\nArrayList after removing the third element:");
			System.out.println(fruits);
		} else {
			System.out.println("\nIndex out of bounds.");
		}
	}

}
