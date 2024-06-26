package com.java.trainingassignment;

public class Assign8 {
	public static void main(String[] args) {
		
		String test = "Meghachamp 98 @ gmail. com";
		count(test);
	}
	
	public static void count(String x) {
		 
		char[]ch = x.toCharArray();
		
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for (int i = 0; i <= x.length(); i++) {
			
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else {
				other++;
			}
		}
		
		System.out.println("The string is : Meghachamp 98 @ gmail. com");
		
		// Display the counts of letters, spaces, numbers, and other characters
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
	}
}
