package day23;

import util.InputFromUser;

public class FizzBuzz {
	public static void main(String[] args) {
		// TODO
		// write a program that prints numbers from 1 to 100 inclusive
		// except 
		// - if number is divisible by 3 evenly, print "Fizz"
		// - if number is divisible by 5 evenly, print "Buzz"
		// - if number is divisible by 3 and 5, print "Fizz Buzz"

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
	}
}
