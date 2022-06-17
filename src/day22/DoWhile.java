package day22;

import util.InputFromUser;

public class DoWhile {
	public static final int MY_NUMBER = 7;
	
	public static void main(String[] args) {
		String strNumber;
		int number;
		
		do {
			strNumber = InputFromUser.getInput("Enter number:");
			number = Integer.parseInt(strNumber);

		} while (number != MY_NUMBER);
		
		System.out.println("Congrats!");
		
		// What's the difference between while loop and do while loop?
		// 1. in do while loop the body of the loop goes first and then condition
		//    in while loop the condition goes first and then body
		// 2. do while loop will have at least 1 iteration
		//    but while loop can have 0 iterations.				
	}
}
