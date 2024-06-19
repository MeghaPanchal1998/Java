package com.java.trainingassignment;

public class Assign34 {
	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			a[5] = 30 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index out of bounds: " + e.getMessage());
		} catch (ArithmeticException e) {

			System.out.println("Arithmetic Exception: " + e.getMessage());
		} catch (Exception e) {

			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
