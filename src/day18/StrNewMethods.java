package day18;

public class StrNewMethods {
	public static void main(String[] args) {
		// These methods are available from Java 11
		
		// isBlank() returns true if string is empty or consist of white spaces only
		String str = "";
		String strTwo = "  ";
		String strThree = "wooden spoon";
		
		System.out.println(str.isBlank()); // true
		System.out.println(strTwo.isBlank()); // true
		System.out.println(strThree.isBlank()); // false
		System.out.println("------");
		
		System.out.println(str.isEmpty()); // true
		System.out.println(strTwo.isEmpty()); // false
		System.out.println(strThree.isEmpty()); // false
		
		// repeat(count) returns a string whose value is concatenation of this string repeated count times.
		String name = "Alex";
		name = name.repeat(100);
		System.out.println(name);
		
		String strFour = "Java";
		String strFour2x = strFour.repeat(2);
		
		System.out.println(strFour);
		System.out.println(strFour2x);
	}
}
