package com.java.trainingassignment;

import java.util.HashMap;

public class Assign55 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");

		int size = map.size();

		System.out.println("Number of key-value mappings in the map: " + size);
	}

}
