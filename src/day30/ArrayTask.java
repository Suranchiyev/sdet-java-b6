package day30;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		String[] name = {"Isla", "Olivia", "Aurora", "Ada", "Charlotte", "Cora"};
		// TODO print each element of String array in all upper cases.
		
		for (int i = 0; i < name.length; i++) {
			String eachName = name[i];
			System.out.println(eachName.toUpperCase());
		}		
		System.out.println("--------");
		
		byte[] score = {9, 8, 7, 5, 5, 6, 9, 10};
		// TODO find out and print average score from score array. 
		// Average score:
		
		int scoreSum = 0;
		for (int i = 0; i < score.length; i++) {
			scoreSum += score[i];
		}
		System.out.println("Average score: " + (scoreSum / score.length));
		System.out.println("----------");
		
		//                      0    1    2    3
		double[] coordinate = {3.5, 5.9, 2.1, 1.9};
		// TODO print numbers from coordinate array in reverse order in the same line 
		//      separated by space.
		
		// 1.9 2.1 5.9 3.5
		
		for (int i = coordinate.length - 1; i >= 0; i--) {
			System.out.print(coordinate[i] + " ");
		}
		System.out.println();
 		System.out.println("-----------");
 		
 		//  0  1  2  3
 		// [1, 2, 3, 4, 5 ... 100]
 		int[] numbers = new int[100];
 		// TODO assign value for each element of array from 1 to 100 by using loop
 		// after array is assigned, print first and last element
 		// 1
 		// 100
 		
 		for (int i = 0; i < numbers.length; i++) {
 			numbers[i] = i + 1;
 		}
 		
 		System.out.println(Arrays.toString(numbers));
 		System.out.println(numbers[0]);
 		System.out.println(numbers[numbers.length - 1]);
	}
	
}
