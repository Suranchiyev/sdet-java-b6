package day24;

import util.InputFromUser;

public class Pyramid {
	/*
	 * Ask a user to input a number and print pyramid based on that number
	 * Enter number:
	 * 5
	 * #
	 * ##
	 * ###
	 * ####
	 * #####
	 * 
	 * Enter number:
	 * 3
	 * #
	 * ##
	 * ###
	 */
	public static void main(String[] args) {
		String strNumber = InputFromUser.getInput("Enter number:");
		int number = Integer.parseInt(strNumber);
		// System.out.println(number);

		for (int i = 0; i < number; i++) {

			for (int j = 0; j < i + 1; j++) {              
				System.out.print("#");
			}
			
			System.out.println();		
		}
	}
}
