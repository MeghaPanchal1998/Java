package com.java.trainingassignment;

class MyThread extends Thread {
	public void run() {

		System.out.println("Thread is running...");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i);
			try {
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Thread finished.");
	}
}

public class Assign39 {

	public static void main(String[] args) {
		MyThread thread = new MyThread(); 
		thread.start(); 
	}

}
