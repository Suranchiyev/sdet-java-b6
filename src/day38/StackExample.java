package day38;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		// Stack is LIFO based data structure
		// LIFO - Last In, First Out
		// push(element) - it adds new element to the stack 
		// pop()         - it gets the most recently pushed element from the stack
		
		Stack<String> stack = new Stack<>();
		stack.push("Alex");
		stack.push("Kuba");
		stack.push("Daniel");
		stack.push("Florencia");
		
		System.out.println(stack); // [Alex, Kuba, Daniel, Florencia]
		
		String element = stack.pop();
		System.out.println(element); // Florencia
		System.out.println(stack); // [Alex, Kuba, Daniel]
	}
}
