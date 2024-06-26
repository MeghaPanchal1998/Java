package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign59 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(2);
		list2.add(1);

		boolean isEqual = compareArrayLists(list1, list2);

		if (isEqual) {
			System.out.println("ArrayLists are equal");
		} else {
			System.out.println("ArrayLists are not equal");
		}
	}

	public static boolean compareArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		if (list1.size() != list2.size()) {
			return false;
		}

		for (int i = 0; i < list1.size(); i++) {
			if (!list1.get(i).equals(list2.get(i))) {
				return false;
			}
		}

		return true;
	}

}
