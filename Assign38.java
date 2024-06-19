package com.java.trainingassignment;

class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Thread is running.");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Count: " + i);
			try {
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted.");
			}
		}
		System.out.println("Thread finished.");
	}
}

public class Assign38 {

	public static void main(String[] args) {

		Thread thread = new Thread(new MyRunnable());

		thread.start();

		System.out.println("Main thread continues to run alongside the new thread.");
	}
}
