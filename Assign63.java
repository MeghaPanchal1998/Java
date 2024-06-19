package com.java.trainingassignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Assign63 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Date");

		List<String> listFromSet = new ArrayList<>(hashSet);

		System.out.println("List elements:");
		for (String element : listFromSet) {
			System.out.println(element);
		}
	}
}
