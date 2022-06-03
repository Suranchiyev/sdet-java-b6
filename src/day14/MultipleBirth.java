package day14;

import util.InputFromUser;

public class MultipleBirth {
	public static void main(String[] args) {
		// How do we determine when to use if else and when to use switch statement?
		// when we have more complex condition, it is good to use if else statements
		// when we have simple mapping, it is good to use switch statement
		
		String strNumberOfBabies = InputFromUser.getInput("Enter number of babies:");
		int numberOfBabies = Integer.parseInt(strNumberOfBabies);
		
		switch(numberOfBabies) {
		case 1:
			System.out.println("Congratulations!");
			break;
		case 2:
			System.out.println("Wow. Twins!");
			break;
		case 3:
			System.out.println("Wow. Triplets!");
			break;
		case 4:
		case 5:	
			System.out.println("Unbelievable! " + numberOfBabies + " babies");
			break;
		default:
			System.out.println("I don't believe you.");
		}
	}
}




