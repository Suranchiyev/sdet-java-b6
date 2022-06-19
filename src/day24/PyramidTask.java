package day24;

import util.InputFromUser;

public class PyramidTask {
	/*
	 * Write a program that ask user number input
	 * print pyramid based on the number in this format
	 * 
	 * Enter number:
	 * 4
	 * #
	 * ##
	 * ###
	 * ####
	 * ###
	 * ##
	 * #
	 * --------------------
	 * Enter number:
	 * 2
	 * #
	 * ##
	 * #
	 * 
	 */
	public static void main(String[] args) {
		String strN = InputFromUser.getInput("Enter number:");
		int n = Integer.parseInt(strN);
		
		String hash = "#";
		for (int i = 0; i < n; i++) {
			System.out.println(hash);
			hash += "#";
		}
		
		for (int i = 1; i < n; i++) {
			System.out.println(hash.substring(0, n - i));
		}
	}
}






