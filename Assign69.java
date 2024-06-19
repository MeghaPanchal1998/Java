package com.java.trainingassignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Assign69 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);

		Collection<Integer> values = map.values();

		System.out.println("Collection view of values:");
		for (Integer value : values) {
			System.out.println(value);
		}
	}

}
