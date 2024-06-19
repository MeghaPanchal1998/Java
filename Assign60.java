package com.java.trainingassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assign60 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		System.out.println("Original ArrayList:");
		System.out.println(numbers);

		int index1 = 1;
		int index2 = 3;
		swapElements(numbers, index1, index2);

		System.out.println("\nArrayList after swapping elements at positions " + index1 + " and " + index2 + ":");
		System.out.println(numbers);
	}

	public static void swapElements(ArrayList<Integer> list, int index1, int index2) {

		if (index1 >= 0 && index1 < list.size() && index2 >= 0 && index2 < list.size()) {

			Collections.swap(list, index1, index2);
		} else {
			System.out.println("Invalid indices. Elements not swapped.");
		}
	}

}
