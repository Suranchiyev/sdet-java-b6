package day22;

import util.InputFromUser;

public class Login {
	public static final String PASSWORD = "Qwerty123!";
	public static final int NUMBER_OF_TRIES = 3;
	
	public static void main(String[] args) {
		String inputPassword;
		int tryCount = 0;
		
		do {
			inputPassword = InputFromUser.getInput("Enter your password:");
			tryCount++;
		} while (!inputPassword.equals(PASSWORD) && tryCount < NUMBER_OF_TRIES);
		
		// 1. password was correct
		// 2. Try count is greater than number of tries
		
		if (inputPassword.equals(PASSWORD)) {
			System.out.println("Welcome to Dashboard!");
		} else {
			System.out.println("Your account is blocked. Contact support team.");		
		}

	}
}
