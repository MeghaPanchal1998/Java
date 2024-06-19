package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign67 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("Elderberry");

		System.out.println("Elements of ArrayList with positions:");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Position " + i + ": " + arrayList.get(i));
		}
	}

}
