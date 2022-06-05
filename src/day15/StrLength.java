package day15;

public class StrLength {
	public static void main(String[] args) {
		// String is immutable object that holds sequence of characters between double quotes
		// Immutable means that once we created String, we cannot change its 
		// original value
		
		String str = "apple";
		System.out.println(str + "!"); // apple!
		System.out.println(str); // apple
		
		str = str + "!"; // this is reassignment(right side will create new String)
		System.out.println(str); // apple!
		
		// String has many useful methods that work with its value
		str = "apple";
		System.out.println(str);
		// length() is used to find out number of characters in the String.
		int numberOfChars = str.length();
		System.out.println(numberOfChars);
		
		str = "orange";
		numberOfChars = str.length();
		System.out.println(str);
		System.out.println(numberOfChars); // 6
		
		// space is also counted as a char
		str = "  kiwi ";
		System.out.println(str);
		System.out.println(str.length()); // 7
	}
}
