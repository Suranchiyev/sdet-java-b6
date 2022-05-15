package day4;

public class Var2 {
	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		
		System.out.println(firstName); // John
		System.out.println(lastName); // Doe
		
		// John Doe
		// we can join multiple strings together
		// we call it - concatenation
		// concatenation when we join strings by using +
		
		//                    "John" + " " + "Doe" -> "John Doe"
		System.out.println(firstName + " " + lastName);
		
		String fullName = firstName + " " + lastName;
		System.out.println(fullName); // John Doe
		
		String address = "101 Main st", state = "VA", country = "USA";
		System.out.println(address + "\n" + state + "\n" + country); 
	}
}
