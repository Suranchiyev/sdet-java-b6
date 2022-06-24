package day26;

// The class is blueprint (template) for objects in java
public class Person {
	// properties/instance variables
	public String firstName;
	public String lastName;
	public int age;
	
	public Person() {
		System.out.println("inside empty constructor");
	}
	
	public Person(String firstName, String lastName, int age) {
		System.out.println("inside 3 args constructor");
		// this refers to current object
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Person(String firstName, int age) {
		System.out.println("inside 2 args constructor");
		this.firstName = firstName;
		this.age = age;
	}
	
	// methods inside the class that serves as a template
	// are behaviors of objects and most of the time
	// they work/manipulate object properties
	public void printFullName() {
		System.out.println(firstName + " " + lastName);
	}
	
	public String getFullDetails() {
		String res = firstName + " " + lastName + " " + age;
		return res;
	}
	
	public void increaseAge(int amount) {
		age += amount;
	}
}

