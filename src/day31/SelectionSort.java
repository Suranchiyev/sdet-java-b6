package day31;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(num)); // [6, 3, 2, 10, 0, 7, 5]
		sortArray(num);
		System.out.println(Arrays.toString(num)); // [0, 2, 3, 5, 6, 7, 10]
	}
	
	public static void sortArray(int[] arr) {
		//  0  1  2  3  4  5  6
		// [0, 2, 3, 5, 6, 7, 10]
		for (int i = 0; i < arr.length; i++) {
			// get smallest index starting from element under index i
			//     4                             0
			int smallestIndex = getSmallestIndex(i, arr);
			
			// swap first unsorted element with the smallest element
			int tmp = arr[smallestIndex]; 
			arr[smallestIndex] = arr[i];
			arr[i] = tmp;
		}
	}
	
	public static int getSmallestIndex(int startFrom, int[] arr) {
		int minValue = arr[startFrom];
		int smallestIndex = startFrom;
		
		for (int i = startFrom + 1; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
				smallestIndex = i;
			}
		}
		
		return smallestIndex;
	}
}
