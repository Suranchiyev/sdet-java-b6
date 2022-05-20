package day6;

import util.InputFromUser;

public class InputDemo {
	public static void main(String[] args) {
		String answer = InputFromUser.getInput("What's your name?");
		
		System.out.println("Nice to meet you, " + answer);
		
		String answerTwo = InputFromUser.getInput("How are you?");
		System.out.println("answer two: " + answerTwo);
	}
}
