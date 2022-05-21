package day7;

import util.InputFromUser;

public class FavoriteColor {
	public static void main(String[] args) {
		// TODO write a program that will ask user the favorite color
		//      and it should print the color provided by user in this format
		//      Your favorite color is <color>
		
		String userColor = InputFromUser.getInput("What's your favorite color?");
		System.out.println("Your favorite color is " + userColor);
		
		System.out.println("Enter two values:");
		
		String value = InputFromUser.getInput();
		String value2 = InputFromUser.getInput();
		
		System.out.println("value: " + value);
		System.out.println("value2: " + value2);
	}
}
