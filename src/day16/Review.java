package day16;

public class Review {
	public static void main(String[] args) {
		// How do we find out number of characters in the String?
		String str = "Hello, World!";
		int strSize = str.length();
		System.out.println(str);
		System.out.println("Number of chars in str: " + strSize);
		
		// toUpperCase() and toLowerCase()
		System.out.println(str.toUpperCase()); // HELLO, WORLD!
		System.out.println(str.toLowerCase()); // hello, world!
		System.out.println(str); // hello, world!
		
		// I want the str to have all in upper case
		str = str.toUpperCase();
		System.out.println(str); // HELLO, WORLD!
	}
}
