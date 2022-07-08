package day32;

import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		System.out.println(getMax(new int[] {4, 3, 5, 6, 9, 5, 2})); // 9
		System.out.println(getMax(new int[] {1, 2, 3})); // 3
		System.out.println(getMax(new int[] {5, 5, 5})); // 5
		System.out.println("--------");
		
		System.out.println(getSecondMax(new int[] {4, 3, 5, 6, 9, 5, 2})); // 6
		System.out.println(getSecondMax(new int[] {1, 2, 3})); // 2
		System.out.println(getSecondMax(new int[] {5, 5, 5})); // 5	
		System.out.println("--------");
		
		System.out.println(getNMax(new int[] {4, 3, 5, 6, 9, 5, 2}, 3)); // 5
		System.out.println(getNMax(new int[] {1, 2, 3}, 1)); // 3
		System.out.println(getNMax(new int[] {5, 5, 5}, 2)); // 5
		System.out.println(getNMax(new int[] {4, 3, 5, 6, 9, 5, 2}, 1)); // 9
		
		System.out.println(Integer.MIN_VALUE); // the smallest value int can hold -> -2147483648
	}
	
	/*
	 * return the biggest element from arr array
	 * getMax([4, 3, 5, 6, 9, 5, 2]) -> 9
	 * getMax([1, 2, 3]) -> 3
	 * getMax([5, 5, 5]) -> 5
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		
		for (int num : arr) {
			if (max < num) {
				max = num;
			}
//			max = Math.max(max, num);
		}
		
		return max;
	}
	
	/*
	 * return the second biggest element from arr array
	 * getMax([4, 3, 5, 6, 9, 5, 2]) -> 6
	 * getMax([1, 2, 3]) -> 2
	 * getMax([5, 5, 5]) -> 5
	 */
	public static int getSecondMax(int[] arr) {
//		Arrays.sort(arr);
//		return arr[arr.length - 2];
		int max = arr[0];
		int secondMax = max;
		
		for (int num : arr) {
			if (max < num) {
				secondMax = max;
				max = num;
			}
		}
		
		return secondMax;
	}
	
	/*
	 * return the second biggest element from arr array
	 * getMax([4, 3, 5, 6, 9, 5, 2], 3) -> 5
	 * getMax([1, 2, 3], 1) -> 3
	 * getMax([5, 5, 5], 2) -> 5
	 * getMax([4, 3, 5, 6, 9, 5, 2], 1) -> 9
	 */
	public static int getNMax(int[] arr, int n) {
//		Arrays.sort(arr);
//		return arr[arr.length - n];

		int max = arr[0];
		for (int i = 0; i < n; i++) {
			max = arr[0];
			int maxIndex = 0;			
			for (int j = 0; j < arr.length; j++) { 
				if (max < arr[j]) {
					max = arr[j];
					maxIndex = j;
				}
			}
			arr[maxIndex] = Integer.MIN_VALUE;
		}
		
		return max;
	}
	
}
