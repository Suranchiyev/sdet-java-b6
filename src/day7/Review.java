package day7;

public class Review {
	public static void main(String[] args) {
		// - % 
		// - local variables, instance variables, static variables	
		// - input from the user
		
		System.out.println(10 % 3); // 1
		
		// if we do remainder by 2 for even number we always get 0
		System.out.println(118 % 2); // 0
		System.out.println(33 % 2); // 1
		
		int age = 66;
		System.out.println(age);
		// local variables are variables that created inside methods and statements
		// - they cannot be visible outside of the block where it was created
		// - they don't have default values
		// - they cannot have access modifiers
		
		// instance variables are variables are class level variables. They will be properties
		// of the object that will be created from that class.
		
		// static variables are global variables. They are accessible within all objects
		// from that class. They belong to the class and not to specific object. We use
		// static variables by class name.
	}
}
