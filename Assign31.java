package com.java.trainingassignment;

abstract class Shape {

	public abstract void RectangleArea(double length, double breadth);

	public abstract void SquareArea(double side);

	public abstract void CircleArea(double radius);
}

class Area extends Shape {

	public void RectangleArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

	public void SquareArea(double side) {
		double area = side * side;
		System.out.println("Area of Square: " + area);
	}

	public void CircleArea(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle: " + area);
	}
}

public class Assign31 {

	public static void main(String[] args) {

		Area areaCalculator = new Area();

		areaCalculator.RectangleArea(5.0, 3.0);
		areaCalculator.SquareArea(4.0);
		areaCalculator.CircleArea(3.0);
	}

}
