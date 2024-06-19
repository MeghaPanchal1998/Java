package com.java.trainingassignment;

import java.util.HashSet;

public class Assign62 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Date");

		String[] array = new String[hashSet.size()];
		hashSet.toArray(array);

		System.out.println("Array elements:");
		for (String element : array) {
			System.out.println(element);
		}
	}

}
