package day36;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SumOfOdd {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 1, 8, 6, 10, 11, 3));
		
		// TODO find out and print sum of odd numbers from numbers list
		int sumOfOdd = 0;
		
		for (int num : numbers) {
			if (num % 2 == 1) {
				sumOfOdd += num;
			}
		}
		
		System.out.println("Sum of odd numbers: " + sumOfOdd);
		
	}
}
