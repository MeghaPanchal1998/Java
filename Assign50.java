package com.java.trainingassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assign50 {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Date");
		fruits.add("Elderberry");

		System.out.println("Original ArrayList:");
		System.out.println(fruits);

		Collections.shuffle(fruits);

		System.out.println("\nShuffled ArrayList:");
		System.out.println(fruits);
	}

}
