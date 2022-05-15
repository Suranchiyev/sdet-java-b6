package day4;

public class Var {
	public static void main(String[] args) {
		// variable - it is a container that can hold piece of data
		// - before using it, we need to declare(create) a variable
		
		
		// String - data type. In java we need specify what data type 
		//          should our variable hold. 
		// firstName - name of the variable
		
		// this is variable declaration
		String firstName;
		
		// assign value for firstName as John
		firstName = "John";
		
		System.out.println(firstName); // John
		System.out.println(firstName); // John
		
		firstName = "Alex";
		System.out.println(firstName); // Alex
		System.out.println(firstName); // Alex
		
		// declare a variable of type String and assign value as Doe
		String lastName = "Doe";
		System.out.println(lastName); // Doe
		System.out.println("----"); 
		
		// we can declare multiple variables of the same type in the same statement
		String address, state, country;
		address = "101 Main st";
		state = "VA";
		country = "USA";
		
		System.out.println(address + " " + state + " " + country);
		
		System.out.println(address);
		System.out.println(state);
		System.out.println(country);
	}
}


