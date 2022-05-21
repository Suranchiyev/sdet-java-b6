package day7;

import util.InputFromUser;

public class YearOfBirth {
	public static int currentYear = 2022;
	
	public static void main(String[] args) {
		String ageStr = InputFromUser.getInput("Provide age(as int):");
		System.out.println(ageStr + " is provided.");
		//  35 <-                  "35"
		int age = Integer.parseInt(ageStr);
		
		// int age = Integer.parseInt("hello");
		// if parse int gets non numeric value, it will throw NumberFormatException
		
		int yearOfBirth = currentYear - age;
		System.out.println("Year of birth: " + yearOfBirth);
	}
}
