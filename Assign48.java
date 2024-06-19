package com.java.trainingassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assign48 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(50);

		System.out.println("Original ArrayList:");
		System.out.println(numbers);

		Collections.sort(numbers);

		System.out.println("\nSorted ArrayList:");
		System.out.println(numbers);
	}

}
