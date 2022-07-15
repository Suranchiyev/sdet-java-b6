package day34;

import java.util.Arrays;

public class ChangeArray {
	public static void main(String[] args) {
		int[] numArr = {1, 2, 3, 4, 5};
		int[] numArrTwo = numArr;
		
		System.out.println(Arrays.toString(numArr)); // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(numArrTwo)); // [1, 2, 3, 4, 5]
		
		numArrTwo[0] = -7;
		
		System.out.println(Arrays.toString(numArr)); // [-7, 2, 3, 4, 5]
		System.out.println(Arrays.toString(numArrTwo)); // [-7, 2, 3, 4, 5]
		System.out.println("--------");
		
		int[] numbers = {1, 2, 3, 4, 5};
		// Take a copy of numbers array
		//Arrays.copyOf(original array we want to copy, the size of our new array)
		int[] numbersTwo = Arrays.copyOf(numbers, numbers.length);
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbersTwo));
		
		numbersTwo[0] = -7;
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbersTwo));
	}
}
