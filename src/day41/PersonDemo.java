package day41;

public class PersonDemo {
	public static void main(String[] args) {
		Person john = new Person();
		john.firstName = "John";
		john.lastName = "Doe";
		john.age = 27;
		System.out.println(john.getFullName());
		
		Person obj = new Person();
		System.out.println(obj.getFullName());
		System.out.println("---------");
		
		Person objTwo = new Person("Alex", "Rod", 37);
		System.out.println(objTwo.getFullName());
		
		Person objThree = new Person("Kuba", "Zhaanbaev", 37);
		System.out.println(objThree.getFullName());
	}
}






