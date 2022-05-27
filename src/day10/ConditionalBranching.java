package day10;

import util.InputFromUser;

public class ConditionalBranching {
	public static void main(String[] args) {
		String strI = InputFromUser.getInput("Enter value for i(int):");
		String strJ = InputFromUser.getInput("Enter value for j(int):");
		
		int i = Integer.parseInt(strI);
		int j = Integer.parseInt(strJ);
		
		System.out.println("i: " + i); 
		System.out.println("j: " + j); 
		
		// if i is greater than j multiply j by 2
		// otherwise multiply i by 2
		//  5 > 5 
		if (i > j) {
			System.out.println("increasing j");
			j *= 2;
			
		} else {
			System.out.println("increasing i");
			i *= 2;
		}
		
		System.out.println("i: " + i); // 20
		System.out.println("j: " + j); // 11
	}
}
