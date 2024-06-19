package com.java.trainingassignment;

import java.util.HashMap;

public class Assign54 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();

		
		map.put(2, "Banana");
		map.put(3, "Cherry");

		
		System.out.println("HashMap after associating values with keys:");
		System.out.println(map);

		int newKey = 4;
		String newValue = "Date";
		map.put(newKey, newValue);

		
		System.out.println("\nHashMap after adding a new key-value pair:");
		System.out.println(map);
	}

}
