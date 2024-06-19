package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign44 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		int index = 2; 

		if (index >= 0 && index < numbers.size()) {
			Integer element = numbers.get(index);
			System.out.println("Element at index " + index + ": " + element);
		} else {
			System.out.println("Index out of bounds.");
		}
	}

}
