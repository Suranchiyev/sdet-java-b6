package day47;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(findSecondMax(new int[] {4, 781, 8, 99, 103})); // 103
		System.out.println(findSecondMax(new int[] {1, 2, 3, 4, 5})); // 4
		System.out.println(findSecondMax(new int[] {3, 4})); // 3
		System.out.println(findSecondMax(new int[] {7, 6, 8, 8, 8})); // 7
		System.out.println(findSecondMax(new int[] {99, 6, 8, 8, 8})); // 8
		System.out.println(findSecondMax(new int[] {8, 8, 8, 8, 8})); // 8
		System.out.println("---------");
		
		System.out.println(findSecondMax2(new int[] {4, 781, 8, 99, 103})); // 103
		System.out.println(findSecondMax2(new int[] {1, 2, 3, 4, 5})); // 4
		System.out.println(findSecondMax2(new int[] {3, 4})); // 3
		System.out.println(findSecondMax2(new int[] {7, 6, 8, 8, 8})); // 7
		System.out.println(findSecondMax2(new int[] {99, 6, 8, 8, 8})); // 8
	}
	
	/*
	 * return second max number from numbers array
	 * findSecondMax([4, 781, 8, 99, 103]) -> 103
	 * findSecondMax([1, 2, 3, 4, 5])      -> 4
	 * findSecondMax([3, 4])               -> 3
	 * findSecondMax([7, 6, 8, 8, 8])      -> 7
	 * findSecondMax([99, 6, 8, 8, 8])     -> 8
	 * findSecondMax([8, 8, 8, 8, 8])      -> -423423523
	 */
	public static int findSecondMax(int[] numbers) {
		int max = numbers[0];
		for (int num : numbers) {
			if (max < num) {
				max = num;
			}
		}
		
		int secondMax = Integer.MIN_VALUE;
		for (int num : numbers) {
			if (secondMax < num && num != max) {
				secondMax = num;
			}
		}
		
		return secondMax == Integer.MIN_VALUE ? max : secondMax;
	}
	
	public static int findSecondMax2(int[] numbers) {
		Arrays.sort(numbers);
		int max = numbers[numbers.length - 1];
		int index = numbers.length - 2;
		
		if (numbers[index] != max) {
			return numbers[index];
		}
		
		while (numbers[index] == max && index > 0) {
			index--;
		}
		
		return numbers[index];
		
	}
}
