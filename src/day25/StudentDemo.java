package day25;

public class StudentDemo {
	public static void main(String[] args) {
		Student john = new Student();
		john.firstName = "John";
		john.lastName = "Doe";
		john.course = "Java - TLA";
		
		System.out.println(john.firstName);
		System.out.println(john.lastName);
		System.out.println(john.course);
		
		System.out.println("--------");
		
		Student alex = new Student("Alex", "Smith", "Selenium");
		System.out.println(alex.firstName);
		System.out.println(alex.lastName);
		System.out.println(alex.course);
	}
}
