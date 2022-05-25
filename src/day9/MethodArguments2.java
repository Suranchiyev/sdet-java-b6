package day9;

import util.InputFromUser;

public class MethodArguments2 {
	public static void main(String[] args) {
		printInfo("John Doe", 20, "101 Main St");
		System.out.println("-----");
		
		String inputName = "Alex";
		int inputAge = 36;
		String inputAddress = "302 North St";
		printInfo(inputName, inputAge, inputAddress);
		System.out.println("-----");
		
		inputName = InputFromUser.getInput("Enter your name:");
		inputAge = Integer.parseInt(InputFromUser.getInput("Enter your age:"));
		inputAddress = InputFromUser.getInput("Enter your address:");
		printInfo(inputName, inputAge, inputAddress);
	}
	
	// how many arguments method can have?
	// as many as we want, but good practice to limit 4-5 arguments
	public static void printInfo(String name, int age, String address) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
	// BREAK TILL 9:18PM EST
}
