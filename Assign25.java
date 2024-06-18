package com.java.trainingassignment;

class Rectangle1 {
	// Data members
	private int length;
	private int breadth;

	// Constructor
	public Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int area() {
		return length * breadth;
	}

	public int perimeter() {
		return 2 * (length + breadth);
	}
}

// Square class inheriting Rectangle
class Square1 extends Rectangle1 {
	// Constructor using super to call parent constructor
	public Square1(int side) {
		super(side, side);
	}
}

public class Assign25 {
	public static void main(String[] args) {
		Rectangle1 rectangle1 = new Rectangle1(5, 10);
		System.out.println("Rectangle - Area: " + rectangle1.area());
		System.out.println("Rectangle - Perimeter: " + rectangle1.perimeter());

		// Creating a Square object
		Square1 square1 = new Square1(4);
		System.out.println("Square - Area: " + square1.area());
		System.out.println("Square - Perimeter: " + square1.perimeter());

	}

}
