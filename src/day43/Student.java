package day43;

/*
 * Student class inherits from the Person class all visible
 * instance variables and methods (Visible by access modifiers)
 * 
 * - The Person class is parent or super class
 * - The Student class is child or sub class
 */
public class Student extends Person {
	public long studentId;
	public String course;
	public char grade;
	
	public void printAllDetails() {
		System.out.println("-- Student --");
		System.out.println(firstName + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Student id: " + studentId);
		System.out.println("Course: " + course);
		System.out.println("Grade: " + grade);
		System.out.println("-------------");
	}
}
