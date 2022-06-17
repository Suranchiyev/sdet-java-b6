package day22;

import util.InputFromUser;

public class LoginWhile {
	public static final String PASSWORD = "Qwerty123!";
	public static final int NUMBER_OF_TRIES = 3;
	
	public static void main(String[] args) {
		String inputPassword = InputFromUser.getInput("Enter your password:");
		int tryCount = 1;
		
		while (!inputPassword.equals(PASSWORD) && tryCount < NUMBER_OF_TRIES) {
			inputPassword = InputFromUser.getInput("Enter your password:");
			tryCount++;
		}
		
		if (inputPassword.equals(PASSWORD)) {
			System.out.println("Welcome to Dashboard!");
		} else {
			System.out.println("Your account is blocked. Contact support team.");
		}
	}
}
