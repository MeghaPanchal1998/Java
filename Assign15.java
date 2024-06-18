package com.java.trainingassignment;

public class Assign15 {
	public static void main(String[] args) {

		String str1 = "topsint.com";
		String str2 = "Topsint.com";
		String str3 = "topsint.com";

		System.out.println("Comparing " + str1 + " and " + str3 + ": " + str1.contentEquals(str3));

		System.out.println("Comparing " + str2 + " and " + str3 + ": " + str2.contentEquals(str3));
	}

}
