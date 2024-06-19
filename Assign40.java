package com.java.trainingassignment;

public class Assign40 {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			try {
				System.out.println("Thread 1 is running");
				Thread.sleep(2000);
				System.out.println("Thread 1 is done");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread thread2 = new Thread(() -> {
			try {
				System.out.println("Thread 2 is running");
				Thread.sleep(2000);
				System.out.println("Thread 2 is done");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Both threads have finished");
	}
}
