package day44;

public class ToStringMethod {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "John";
		person.age = 26;
		person.address = "101 Main St";
		
		System.out.println(person); // Person [name=John, age=26, address=101 Main St]
		System.out.println(person.toString()); // Person [name=John, age=26, address=101 Main St]
	}
}
