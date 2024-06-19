package com.java.trainingassignment;

import java.util.Scanner;

public class Assign35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		try {
			validate(age);
			System.out.println("Welcome to vote!");
		} catch (ArithmeticException e) {
			System.out.println("Exception in thread main java.lang.ArithmeticException: not valid");
		}
	}

	public static void validate(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("not valid");
		}

	}

}
