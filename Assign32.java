package com.java.trainingassignment;

import java.util.Scanner;

public class Assign32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the numerator:");
		int numerator = scanner.nextInt();

		System.out.println("Enter the denominator:");
		int denominator = scanner.nextInt();

		try {

			int result = divideNumbers(numerator, denominator);
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {

			System.out.println("Error: Division by zero is not allowed.");
		} catch (Exception e) {

			System.out.println("An error occurred: " + e.getMessage());
		} finally {

			System.out.println("Program execution completed.");
			scanner.close();

		}
	}

	public static int divideNumbers(int numerator, int denominator) {
		return numerator / denominator;
	}
}
