package com.java.trainingassignment;

import java.util.HashMap;
import java.util.Map;

public class Assign64 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		if (map.isEmpty()) {
			System.out.println("Map is empty.");
		} else {
			System.out.println("Map is not empty. It contains " + map.size() + " key-value mappings.");
		}
	}

}
