package com.java.trainingassignment;

import java.util.Scanner;

public class Assign4 {

	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		
		int i, n=0, s=0;
		double avg;
		
		System.out.print("Input 5 numbers: ");
		
		for(i=0; i<5; i++)
		{
			n=in.nextInt();
			s +=n;
		}
		
		avg = s/5;
		System.out.println("The sum of 5 number is : "+s+"\n The Average is: "+avg);

	}

}
