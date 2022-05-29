package day11;

import util.InputFromUser;

public class EvenOdd {
	public static void main(String[] args) {
		int number = Integer.parseInt(InputFromUser.getInput("Enter any number(int):"));
		System.out.println("Number: " + number);
		
		// How can you find out if number is odd or even in your program?
		
		// number % 2 == 0 -> it is even
		// otherwise false
		
		// even numbers
		// 22 % 2 -> 0
		// 100 % 2 -> 0
		// 48 % 2 -> 0
		
		// odd numbers
		// 7 % 2 -> 1
		// 19 % 2 -> 1
		// 99 % 2 -> 1
			  
		if (number % 2 == 0) {
			System.out.println("This number is even number.");
		} else {
			System.out.println("This number is odd number.");
		}
	}
	
}
