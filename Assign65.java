package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign65 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		System.out.println("Original ArrayList:");
		System.out.println("Size: " + arrayList.size());
		System.out.println("Elements: " + arrayList);

		arrayList.ensureCapacity(10);

		System.out.println("\nArrayList after increasing size:");
		System.out.println("Size: " + arrayList.size());
		System.out.println("Elements: " + arrayList);
	}

}
