package day18;

import util.InputFromUser;

public class Password {
	public static void main(String[] args) {
		// program should accept from the user the new password to set.
		// - new password should be more or equal 5 chars
		// - it should contain at least one special char (!, $, %)
		// - it should contain at least one numeric value
		//
		
		String password = InputFromUser.getInput("Enter new password:");
		
		if (password.length() < 5) {
			System.out.println("Rejected - new password shoud be more 5 chars");
	
		//          !(password has !  OR password has $ OR password has %)	
		} else if (!(password.contains("!") || password.contains("$") || password.contains("%"))) {
			System.out.println("Rejected - new password should have at least one special char");
			//        false
		} else if (!hasNumber(password)) {		
			System.out.println("Rejected - new password should have at least one numeric value");
			
		} else {
			System.out.println("Accepted!");
		}
	}
	
	// check if string contains a number
	public static boolean hasNumber(String str) {
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
}
