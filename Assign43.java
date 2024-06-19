package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign43 {

	public static void main(String[] args) {

		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		System.out.println("Original ArrayList:");
		System.out.println(fruits);

		fruits.add(0, "Orange");

		System.out.println("\nArrayList after inserting at first position:");
		System.out.println(fruits);
	}

}
