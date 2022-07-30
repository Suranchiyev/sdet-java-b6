package day44;

public class EqualsMethod {
	public static void main(String[] args) {
		Student st1 = new Student("John", "Java", 95.9, 'A');
		Student st2 = new Student("John", "Java", 95.9, 'A');
		
		// How do you compare two custom objects on equality?
		// are they equal based on their properties?
		// yes
		// 1. I can compare each property of two objects
		// 2. I can override equals() and hashCode() methods
		//    to compare objects of this class.
		
		System.out.println(st1.equals(st2)); // true
	}
}
