package com.java.trainingassignment;

import java.util.Scanner;

public class Assign7 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int count = 0;

		System.out.print("Input an integer number less than ten billion : ");
		int n = in.nextInt();
		
		while (n != 0) {

			n /= 10;
			++count;
		}
		System.out.println("Number of digits: " + count);
	}
}
