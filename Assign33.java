package com.java.trainingassignment;

import java.util.Scanner;

public class Assign33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the first number: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();

			int result = divideNumbers(num1, num2);
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {

			System.out.println("Exception occurred: " + e.getMessage());
		} catch (Exception e) {

			System.out.println("An error occurred: " + e.getMessage());
		}

	}

	public static int divideNumbers(int numerator, int denominator) {
		return numerator / denominator;
	}
}
