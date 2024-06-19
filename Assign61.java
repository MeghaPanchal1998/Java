package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign61 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cherry");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Date");
		list2.add("Elderberry");

		list1.addAll(list2);

		System.out.println("Joined ArrayList:");
		System.out.println(list1);
	}

}
