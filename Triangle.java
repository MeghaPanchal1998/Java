package com.java.trainingassignment;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		this.side1 = 3.0;
		this.side2 = 4.0;
		this.side3 = 5.0;
	}

	// Method to calculate the area of the triangle using Heron's formula
	public double calculateArea() {
		// Calculate semi-perimeter
		double s = calculatePerimeter() / 2.0;

		// Calculate area using Heron's formula
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return area;
	}

	public double calculatePerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();

		double area = triangle.calculateArea();
		System.out.println("Area of the triangle: " + area);

		double perimeter = triangle.calculatePerimeter();
		System.out.println("Perimeter of the triangle: " + perimeter);
	}
}
