package com.java.trainingassignment;

public class Assign30 {

	public static long factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {

			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 3;
		int num3 = 2;
		int num4 = 1;
		int num5 = 0;

		
		System.out.println(num1 + "! = " + factorial(num1));
		System.out.println(num2 + "! = " + factorial(num2));
		System.out.println(num3 + "! = " + factorial(num3));
		System.out.println(num4 + "! = " + factorial(num4));
		System.out.println(num5 + "! = " + factorial(num5));
	}

}
