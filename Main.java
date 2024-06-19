package com.java.trainingassignment;

abstract class Parent {

	public abstract void message();
}

class FirstSubclass extends Parent {

	public void message() {
		System.out.println("This is first subclass");
	}
}

class SecondSubclass extends Parent {

	public void message() {
		System.out.println("This is second subclass");
	}
}

public class Main {

	public static void main(String[] args) {
		FirstSubclass first = new FirstSubclass();
		SecondSubclass second = new SecondSubclass();

		first.message();

		second.message();

	}

}
