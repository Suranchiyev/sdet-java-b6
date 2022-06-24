package day26;

public class PersonDemo {
	public static void main(String[] args) {
		// Object is an actual implementation of the class
		Person person = new Person();
		System.out.println(person.firstName); // null 
		System.out.println(person.lastName); // null
		System.out.println(person.age); // 0
		// Default values:
		// Object => null
		// Numeric primitives => 0
		// Boolean => false
		
		person.firstName = "Kuba";
		person.lastName = "Zhaanbaev";
		person.age = 35;
		
		Person personTwo = new Person();
		System.out.println(personTwo.firstName);
		System.out.println(personTwo.lastName);
		System.out.println(personTwo.age);
		
		System.out.println(person.firstName); // Kuba
		System.out.println(person.lastName); // Zhaanbaev
		System.out.println(person.age); // 35
		
	}
}
