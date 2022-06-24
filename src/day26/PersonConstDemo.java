package day26;

public class PersonConstDemo {
	public static void main(String[] args) {
		// what's constructor in java?
		// - It is a special method that constructs the object
		// - when we create object we always run constructor
		// - if we don't have constructor defined in our class
		//   java will provide default empty constructor.
		
		Person person = new Person();
		person.firstName = "Alex";
		person.lastName = "Rodriguez";
		person.age = 36;
		System.out.println("----------");
		
		Person personTwo = new Person("Vijay", "Kumar", 45);
		System.out.println(personTwo.firstName);
		System.out.println(personTwo.lastName);
		System.out.println(personTwo.age);
		System.out.println("----------");
		
		Person personThree = new Person("Ramesh", 43);
		System.out.println(personThree.firstName); // Ramesh
		System.out.println(personThree.age); // 43
		
		Person personFour = new Person("Milena", 30);
		
	}
}
