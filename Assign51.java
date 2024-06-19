package com.java.trainingassignment;

import java.util.HashSet;

public class Assign51 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");

		System.out.println("Original HashSet:");
		System.out.println(hashSet);

		String elementToAdd = "Date";
		hashSet.add(elementToAdd);

		System.out.println("\nHashSet after appending '" + elementToAdd + "':");
		System.out.println(hashSet);
	}

}
