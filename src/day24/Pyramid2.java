package day24;

import util.InputFromUser;

public class Pyramid2 {
	public static void main(String[] args) {
		String strNumber = InputFromUser.getInput("Enter number:");
		int number = Integer.parseInt(strNumber);

		String hash = "#";
		for (int i = 0; i < number; i++) {
			System.out.println(hash);   
			hash += "#";
		}
	}
}
