package day13;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		// 1. create instance(object) of Random class
		// 'new' is used to create objects.
		Random random = new Random();
		
		// 0 1 2 3 4 5 6 7 8 9 10 11 .. 100 	
		//                         0 - 100
		int randomNumber = random.nextInt(101);
		System.out.println(randomNumber);
		
		// I want to create a program that will choose randomly the student(5 students) from the class
		
		// Agatha    0
		// Cristina  1
		// Erik      2
		// Gustavo   3
		// Maksym    4
		
		int rNumberForStudent = random.nextInt(5);
		if (rNumberForStudent == 0) {
			System.out.println("Agatha");
			
		} else if (rNumberForStudent == 1) {
			System.out.println("Cristina");
			
		} else if (rNumberForStudent == 2) {
			System.out.println("Erik");
			
		} else if (rNumberForStudent == 3) {
			System.out.println("Gustavo");
			
		} else {
			System.out.println("Maksym");
		}
	}
}
