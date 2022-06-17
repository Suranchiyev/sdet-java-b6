package day22;

import util.InputFromUser;

public class WarmUp {
	public static final int MY_NUMBER = 7;
	
	public static void main(String[] args) {
		// while loop
		
		String strNumber = InputFromUser.getInput("Enter number:");
		int number = Integer.parseInt(strNumber);
		
		// keep asking use the input till user gets correct number
		while (number != MY_NUMBER) {
			
			strNumber = InputFromUser.getInput("Enter number:");
			number = Integer.parseInt(strNumber);
		}
		
		System.out.println("Congrats!");
	}
}
