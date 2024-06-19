package com.java.trainingassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assign57 {
	
	public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

       
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        
        System.out.println("Original ArrayList:");
        System.out.println(numbers);

        
        Collections.reverse(numbers);

        // Print the reversed ArrayList
        System.out.println("\nReversed ArrayList:");
        System.out.println(numbers);
    }

}
