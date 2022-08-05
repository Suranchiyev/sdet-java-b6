package day48;

import util.InputFromUser;

public class HandleExceptions {
	public static void main(String[] args) {
		// read input from user as a number
		// and check if that number is greater than 100
		
		String inputStr = InputFromUser.getInput("Enter any number:");
		try {
			int num = Integer.parseInt(inputStr);

			if (num > 100) {
				System.out.println(num + " is greater than 100");
			} else {
				System.out.println(num + " is less than 100");
			}
		} catch(NumberFormatException e) {
			// handle exception here
			System.out.println("Invalid input (prvide only numeric values): " + inputStr);
		}

	}
}
