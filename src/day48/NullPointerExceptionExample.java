package day48;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		// All object references can hold null values
		// null means that this reference doesn't point to any object
		String str = null;
		System.out.println(str);
		
		// when exception is thrown the program will stop and display the exception
		// msg in the console
		System.out.println(str.toUpperCase()); // NullPointerException
		
		// we need to read excpetion msg from the top
		System.out.println("Hello, world!");
		
		// When do you get NullPointerException?
		// When our object/reference pointing to null and we try to use its method or property,
		// we get NullPointerException exception.
		
		// How to prevent that?
		// Check if our object is null or not before using it.
	}
}
