package day21;

import util.InputFromUser;

public class Password {
	public static void main(String[] args) {
		// program should accept from the user the new password to set.
		// - new password should be more or equal 5 chars
		// - it should contain at least one special char (!, $, %)
		// - it should contain at least one numeric value
		// - it should contain at least one upper case letter
		
		// If new password doesn't meet above requirement, keep asking 
		
		boolean isRejected = true;
		while (isRejected) {
			String newPassword = InputFromUser.getInput("Enter password to set:");
			if (isValidPassword(newPassword)) {
				System.out.println("Accepted");
				isRejected = false;
			} else {
				System.out.println("Rejected");
			}
		}
	}
	
	public static boolean isValidPassword(String password) {
		if (password.length() < 5) {
			return false;
		} else if (!(password.contains("!") || password.contains("$") || password.contains("%"))) {
			return false;
 		} else if (!atLeastOneNumeric(password)) {
 			return false;
 		} else if (!atLeastOneUpperCaseLetter(password)) {
 			return false;
 		}
		
		return true;
	}
	
	public static boolean atLeastOneNumeric(String password) {
		int index = 0;
		while (index < password.length()) {
			char ch = password.charAt(index);
			if (ch >= 48 && ch <= 57) {
				return true;
			}
			index++;
		}
		
		return false;
	}
	
	public static boolean atLeastOneUpperCaseLetter(String password) {
		int index = 0;
		
		while (index < password.length()) {
			char ch = password.charAt(index);
			if (ch >= 65 && ch <= 90) {
				return true;
			}
			index++;
		}
		
		return false;
	}
}





