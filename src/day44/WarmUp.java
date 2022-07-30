package day44;

public class WarmUp {
	public static void main(String[] args) {
		// TODO
		// Create a program that prints numbers from 1 to 100 inclusive
		// if number is divisible by 3, print "Tech" instead of the number
		// if number is divisible by 5, print "Lead" instead of the number
		// if number is divisible by 3 and 5, print "Tech Lead" instead of the number
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Tech Lead");
			} else if (i % 3 == 0) {
				System.out.println("Tech");
			} else if (i % 5 == 0) {
				System.out.println("Lead");
			} else {
				System.out.println(i);
			}			
		}
	}
}
