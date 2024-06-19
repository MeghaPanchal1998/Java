package com.java.trainingassignment;


public class Assign41 extends Thread{
	
	public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
    	Assign41 t1 = new Assign41();
        t1.start(); 
        t1.start(); 
    }

}
