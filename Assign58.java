package com.java.trainingassignment;

import java.util.ArrayList;
import java.util.List;

public class Assign58 {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		fruits.add("Elderberry");

		System.out.println("Original ArrayList:");
		System.out.println(fruits);

		int fromIndex = 1;
		int toIndex = 4; // exclusive
		List<String> portion = fruits.subList(fromIndex, toIndex);

		System.out.println("\nExtracted portion from index " + fromIndex + " to " + (toIndex - 1) + ":");
		System.out.println(portion);
	}

}
