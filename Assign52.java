package com.java.trainingassignment;

import java.util.HashSet;
import java.util.Iterator;

public class Assign52 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Cherry");
		hashSet.add("Date");

		System.out.println("Iterating through HashSet using an enhanced for loop:");
		for (String element : hashSet) {
			System.out.println(element);
		}

		System.out.println("\nIterating through HashSet using an iterator:");
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
