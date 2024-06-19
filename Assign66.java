package com.java.trainingassignment;

import java.util.ArrayList;

public class Assign66 {
	
	 public static void main(String[] args) {
	       
	        ArrayList<String> arrayList = new ArrayList<>();

	        
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");

	       
	        System.out.println("Original ArrayList:");
	        System.out.println(arrayList);

	        
	        if (arrayList.size() >= 2) {
	            arrayList.set(1, "Grape");
	        } else {
	            System.out.println("ArrayList does not have enough elements to replace the second element.");
	        }

	        
	        System.out.println("\nArrayList after replacing the second element:");
	        System.out.println(arrayList);
	    }

}
