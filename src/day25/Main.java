package day25;

public class Main {
	public static void main(String[] args) {		
		Person person1 = new Person();
		person1.firstName = "John";
		person1.lastName = "Doe";
		person1.age = 25;
		
		System.out.println(person1.firstName);
		System.out.println(person1.lastName);
		System.out.println(person1.age);
		System.out.println("-------");
		
		Person person2 = new Person();
		person2.firstName = "Alex";
		person2.lastName = "Rodriguez";
		person2.age = 37;
		System.out.println(person2.firstName);
		System.out.println(person2.lastName);
		System.out.println(person2.age);
		System.out.println("--------");
		
		Person person3 = new Person();
		System.out.println(person3.firstName);
		System.out.println(person3.lastName);
		System.out.println(person3.age);
		
		// Class is a blueprint for an object
		// Object is implementation(instance) of the class
	}
}

// class is a blueprint for an object in java
class Person {
	public String firstName;
	public String lastName;
	public int age;
}