package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(getSum(new ArrayList<>(Arrays.asList(1, 2, 3))));
		System.out.println(getSum(new ArrayList<>(Arrays.asList(1, 1, 1))));
		System.out.println(getSum(new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2))));
		System.out.println(getSum(new ArrayList<>(Arrays.asList(9, 1))));
	}
	
	/*
	 * return total sum from nums list
	 * getSum([1, 2, 3]) -> 6
	 * getSum([1, 1, 1]) -> 3
	 * getSum([1, 1, 1, 2, 2]) -> 7
	 * getSum([9, 1]) -> 10
	 */
	public static int getSum(List<Integer> nums) {
		int sum = 0;
		
		for (int i : nums) {
			sum += i;
		}
		
		return sum;
	}
}
