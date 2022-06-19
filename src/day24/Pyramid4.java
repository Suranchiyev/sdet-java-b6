package day24;

import util.InputFromUser;

public class Pyramid4 {
	public static void main(String[] args) {
		String strN = InputFromUser.getInput("Enter number:");
		int n = Integer.parseInt(strN);
		
		// available from Java 11
		// String hash = "#";
		// hash = hash.repeat(n);
		
		String hash = "";
		for (int i = 0; i < n; i++) {
			hash += "#";
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(hash.substring(0, n - i));
		}

	}
}
