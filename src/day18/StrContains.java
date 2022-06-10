package day18;

public class StrContains {
	public static void main(String[] args) {
		// contains(value) 
		// it is used to check if string contains another string
		
		String topics = "Variables, assignment operators, arithmetic operators, input from user";
		boolean isThere = topics.contains("input");
		System.out.println(isThere); // true
		
		System.out.println(topics.contains("java")); // false
		System.out.println(topics.contains("from user")); // true
		
		System.out.println(topics.contains("ent op")); // true
		System.out.println(topics.contains("ors, arith operators,")); // false
		
		String name = "John";
		System.out.println(name.contains("John")); // true
	}
}
