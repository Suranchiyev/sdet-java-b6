package day28;

public class StringPoolTask {
	public static void main(String[] args) {
		String name = "John";
		String name1 = "John";
		String name2 = new String("John");	
		
		// What's the output of this program? Can you explain why?
		
		System.out.println(name == name1); // true
		// Because name and name1 point to the same object in the StringPool
		// Java reuse the same object inside the string pool to same memory.
		
		System.out.println(name == name2); // false
		// name and name2 are not pointing to the same object
		// because name2 was create with new keyword and it will not reuse object inside StringPool
		
		System.out.println(name.equals(name2)); // true
		// .equals method is used to compare actual value.
		
	}
}
