package com.java.trainingassignment;

abstract class Marks {

	public abstract double getPercentage();
}

class A extends Marks {

	private int subject1, subject2, subject3;

	public A(int s1, int s2, int s3) {
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
	}

	public double getPercentage() {

		int totalMarks = subject1 + subject2 + subject3;

		return (double) totalMarks / 3;
	}
}

class B extends Marks {

	private int subject1, subject2, subject3, subject4;

	public B(int s1, int s2, int s3, int s4) {
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
		subject4 = s4;
	}

	public double getPercentage() {

		int totalMarks = subject1 + subject2 + subject3 + subject4;

		return (double) totalMarks / 4;
	}
}

public class Assign29 {

	public static void main(String[] args) {

		A studentA = new A(85, 90, 92);
		B studentB = new B(78, 85, 80, 88);

		System.out.println("Percentage of Student A: " + studentA.getPercentage());
		System.out.println("Percentage of Student B: " + studentB.getPercentage());
	}

}
