package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign47 {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");

		System.out.println("Original ArrayList:");
		System.out.println(fruits);

		String elementToSearch = "Cherry";

		int index = fruits.indexOf(elementToSearch);

		if (index != -1) {
			System.out.println("\n" + elementToSearch + " found at index: " + index);
		} else {
			System.out.println("\n" + elementToSearch + " not found in the ArrayList.");
		}
	}

}
