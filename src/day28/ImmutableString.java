package day28;

public class ImmutableString {
	public static void main(String[] args) {
		// String is immutable object that can hold sequence of chars between double quotes.
		
		// We cannot change the value of string because of his immutability
		String str = "apple";
		
		// Only way to change is to create new string
		str = str + ", orange";
		System.out.println(str);
		
		String name = "John";
		String nameTwo = "John";
		
		// when we use == with object references
		// it check if two references point to the same object or not
		
		System.out.println(name == nameTwo); // true
		
		Student student = new Student("John");
		Student studentTwo = new Student("John");
		System.out.println(student == studentTwo); // false
	}
	
}

class Student {
	public String name;
	
	public Student(String name) {
		this.name = name;
	}
}


