package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign49 {

	public static void main(String[] args) {

		ArrayList<Integer> originalList = new ArrayList<>();
		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		originalList.add(4);
		originalList.add(5);

		ArrayList<Integer> copiedList = new ArrayList<>();

		copiedList.addAll(originalList);

		System.out.println("Original ArrayList: " + originalList);
		System.out.println("Copied ArrayList: " + copiedList);
	}
}
