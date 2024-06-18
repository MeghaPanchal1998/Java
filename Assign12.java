package com.java.trainingassignment;

public class Assign12 {

	public static void main(String[] args) {

		int i;

		for (i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				System.out.println("Number divisible by 3: " + i);
			}
		}

		for (i = 1; i <= 100; i++) {

			if (i % 5 == 0) {
				System.out.println("Number divisible by 5: " + i);
			}
		}

		for (i = 1; i <= 100; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("Number divisible by both 3 & 5: " + i);
			}
		}

	}

}
