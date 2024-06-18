package com.java.trainingassignment;

public class Assign23 {

	public static void main(String[] args) {
		Assign23 as = new Assign23();
		as.display();
		
		Child ch = new Child();
		ch.show();
		
		
		Child ch1 = new Child();
		ch1.display();

	}
	
	public void display() {
		System.out.println("This is a parent class");
	}

}

class Child extends Assign23{
	
	public void display() {
		super.display();
		
	}
	
	public void show() {
		System.out.println("This is a child class");	
	}
}
