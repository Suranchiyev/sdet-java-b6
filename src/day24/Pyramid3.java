package day24;

import util.InputFromUser;

/*
 * Enter number:
 * 5
 * #####
 * ####
 * ###
 * ##
 * #
 * 
 * Enter number:
 * 3
 * ###
 * ##
 * #
 * 
 */
public class Pyramid3 {
	public static void main(String[] args) {
		String strN = InputFromUser.getInput("Enter number:");
		int n = Integer.parseInt(strN);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
