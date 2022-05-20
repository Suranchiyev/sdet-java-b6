package day6;

public class Student {
	public static void main(String[] args) {
		String name = "Alex";
		double grade = 95.5;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
		
		// increase grade by 8%
		// 1. find out what is 8% of grade
		double incraseValue = grade * (8.0 / 100);
		System.out.println("8% of " + grade + " is " + incraseValue);
		
		// 2. increase grade by that value
		grade = grade + incraseValue;
		
		System.out.println("Student name is " + name);
		System.out.println("Student grade is " + grade);
	}
}
