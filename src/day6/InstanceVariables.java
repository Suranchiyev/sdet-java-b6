package day6;

public class InstanceVariables {
	public String firstName;
	public String lastName;
	public int age;
	
	public static void main(String[] args) {
		/*
		 * Instance variables are class level variables and 
		 * they will be properties of the object created from this class.
		 * - they are created under class
		 * - they have default values
		 * - they can have access modifiers
		 * 
		 */
		
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.firstName);
		// System.out.println(firstName);
	}
}
