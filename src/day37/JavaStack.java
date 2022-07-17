package day37;

import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		// Stack
		// Deque
		
		// Stack is LIFO data structure
		// LIFO - Last In, First Out
		// - push(element) - to add element into the stack
		// - pop()         - to read and remove element from the top of the stack
		
		Stack<String> emails = new Stack<>();
		emails.push("John");
		emails.push("Alex");
		emails.push("Kuba");
		emails.push("Vijay");
		
		System.out.println(emails);
		System.out.println("reading email from: " + emails.pop()); // reading email from: Vijay
		System.out.println(emails);
		
		System.out.println("reading email from: " + emails.pop()); // reading email from: Kuba
		System.out.println(emails);
		
		emails.push("Bek");
		emails.push("Florencia");
		
		System.out.println("reading email from: " + emails.pop()); // reading email from: Florencia
		System.out.println(emails);
		
		System.out.println("Next email: " + emails.peek());
		System.out.println(emails);
		
		System.out.println("Size of out stack: " + emails.size());
		System.out.println("Is Alex in stack: " + emails.contains("Alex"));
		System.out.println(emails.isEmpty());
	}
}
