package day8;

import util.InputFromUser;

public class Multiply {
	public static void main(String[] args) {
		String strOne = InputFromUser.getInput("Provide first number(int):");
		String strTwo = InputFromUser.getInput("Provide second number(int):");
		int numOne = Integer.parseInt(strOne);
		int numTwo = Integer.parseInt(strTwo);
		int result = numOne * numTwo;
		
		System.out.println(numOne + " * " + numTwo + " = " + result);
		
	}
}
