package com.java.trainingassignment;

public class Assign21 {
	
	public void display(int n, char c) {
		System.out.println(n+ " Is the integer value and " + c + " Is the character value");
	}
	
	public void display(char c, int n) {
		System.out.print(c+ " Is the character value and " + n + " Is the integer value");
	}
	
	public static void main(String args[]) {
		
		Assign21 as = new Assign21();
		as.display(101,'A');
		as.display('B',102);
	}

}
