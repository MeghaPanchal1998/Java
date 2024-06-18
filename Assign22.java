package com.java.trainingassignment;

public class Assign22 {

	public static void main(String[] args) {

		Rectangle obj = new Rectangle();
		obj.Area(30, 20);
		obj.Area(12.5, 4.5);

		Square obj1 = new Square();
		obj1.Area(35.224);
		obj1.Area(5.6);

	}
}

class Square {

	void Area(double side) {
		System.out.println("Area of the Square: " + side * side);
	}

	void Area(float side) {
		System.out.println("Area of the Square: " + side * side);
	}
}

class Rectangle {

	void Area(double l, double b) {
		System.out.println("Area of the rectangle: " + l * b);
	}

	void Area(int l, int b) {
		System.out.println("Area of the rectangle: " + l * b);
	}
}
