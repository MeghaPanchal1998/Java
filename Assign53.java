package com.java.trainingassignment;

import java.util.HashSet;

public class Assign53 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Date");

		int size = hashSet.size();

		System.out.println("Number of elements in the HashSet: " + size);
	}

}
