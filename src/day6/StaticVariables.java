package day6;

public class StaticVariables {
	public static String name = "John";
	public static int age = 40;
	
	public static void main(String[] args) {
		/*
		 * Static variables are global variables. They are shared among all objects
		 * of this class and we can say they belong to class and not to specific
		 * object.
		 * - class level variables
		 * - they can have default
		 * - we don't need to create object to use them, we just use by class name.
		 */
		
		System.out.println(name);
		name = "Smith";
		System.out.println(name);
		
		String name = "Alex";
		System.out.println(name);
		System.out.println(StaticVariables.name);
	}
}
