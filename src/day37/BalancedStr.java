package day37;

import java.util.Stack;

public class BalancedStr {
	public static void main(String[] args) {
		System.out.println(isBalancedStr("[({})]")); // true
		System.out.println(isBalancedStr("[({})]]")); // false
		System.out.println(isBalancedStr("((")); // false
		System.out.println(isBalancedStr("([][]{})")); // true
		System.out.println(isBalancedStr("(([][]{})")); // false
	}
	
	/*
	 * String str will consist of this given brackets: (, [, {, ), ], }
	 * str is balanced when for every open bracket we have corresponding closed bracket
	 * and for closed we have corresponding open
	 * 
	 * 
	 * isBalancedStr("[({})]")  -> true
	 * isBalancedStr("[({})]]") -> false
	 * isBalancedStr("((") -> false
	 * isBalancedStr("([][]{})") -> true
	 */
	public static boolean isBalancedStr(String str) {
		// we will use stack data structure to solve this problem

		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			// every open brackets will be pushed to stack
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				// it means we have ch as closed bracket
				// if it is closed, we will read latest open from the stack
				// and we check if it is correct open bracket
				if (stack.isEmpty()) {
					return false;
				}
				char latestOpen = stack.pop();
				
				// check if closed has correct latest open
				if (!(ch == ')' && latestOpen == '(' || ch == ']' && latestOpen == '[' || ch == '}' && latestOpen == '{')) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

}




