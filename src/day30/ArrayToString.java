package day30;

import java.util.Arrays;

public class ArrayToString {
	public static void main(String[] args) {
		// Arrays is helper class for array in java
		
		int[] numbers = {6, 5, 3, 2, 9, 8, 7, 5};
		// Arrays.toString(array) returns string representation of array
		String arrStr = Arrays.toString(numbers);
		System.out.println(arrStr);
		
		String[] arrFruit = {"apple", "kiwi", "orange", "banana"};
		System.out.println(Arrays.toString(arrFruit));
	}
}
