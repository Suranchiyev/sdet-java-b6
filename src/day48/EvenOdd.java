package day48;

import util.InputFromUser;

public class EvenOdd {
	public static void main(String[] args) {
		// TODO
		// Write a program that will ask from user a numeric value
		// and print even if number is even otherwise odd
		
		// if user provides invalid input, keep asking them to provide number
		// - loop (do while is the best option)
		// - use try catch
		do {
			try {
				String strInput = InputFromUser.getInput("Enter number:");
				int number = Integer.parseInt(strInput);
				
				if (number % 2 == 0) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}
				break;
			} catch(NumberFormatException e) {
				System.out.println("Invalid input");
			}
		} while (true);
	}
}
