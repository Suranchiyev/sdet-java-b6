package day41;

public class Person {
	// properties of objects that will be created from this class
	public String firstName;
	public String lastName;
	public int age;
	
	public Person() {}
	
	public Person(String firstName, String lastName, int age) {
		// this - this current object that calling constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
}
