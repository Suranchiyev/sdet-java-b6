package day8;

import util.InputFromUser;

public class Addition {
	public static void main(String[] args) {
		String answerOne = InputFromUser.getInput("Provide first number(int):");
		String answerTwo = InputFromUser.getInput("Provide second number(int):");
		
		// double dNum = Double.parseDouble("99.9");
		
		int numberOne = Integer.parseInt(answerOne);
		int numberTwo = Integer.parseInt(answerTwo);
		int sum = numberOne + numberTwo;		
		System.out.println(numberOne + " + " + numberTwo + " = " + sum);
	}
}
