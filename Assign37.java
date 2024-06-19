package com.java.trainingassignment;

class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String message) {
		super(message);
	}
}

// NameNotValidException class
class NameNotValidException extends Exception {
	public NameNotValidException(String message) {
		super(message);
	}
}

// Student class
class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;

	public Student(int rollNo, String name, int age, String course)
			throws AgeNotWithinRangeException, NameNotValidException {
		this.rollNo = rollNo;

		// Validate age
		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
		}
		this.age = age;

		// Validate name
		if (!isValidName(name)) {
			throw new NameNotValidException("Name contains numbers or special symbols.");
		}
		this.name = name;

		this.course = course;
	}

	// Method to validate name (checks if it contains numbers or special symbols)
	private boolean isValidName(String name) {
		return name.matches("[a-zA-Z ]+"); // Allows only alphabets and spaces
	}

	// Getters and setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}

public class Assign37 {

	public static void main(String[] args) {
		try {

			Student student1 = new Student(1, "John Doe", 18, "Engineering");
			System.out.println("Student created successfully: " + student1.getName());

			Student student2 = new Student(2, "Jane Smith", 22, "Medicine");
			System.out.println("Student created successfully: " + student2.getName());

			Student student3 = new Student(3, "Alice123", 20, "Business");
			System.out.println("Student created successfully: " + student3.getName());
		} catch (AgeNotWithinRangeException | NameNotValidException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

}
