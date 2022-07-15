package day36;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListTask {
	public static void main(String[] args) {
		System.out.println(sumOfMaxAndMin(new ArrayList<>(Arrays.asList(1, 2, 3, 9, 5)))); // 10
		System.out.println(sumOfMaxAndMin(new ArrayList<>(Arrays.asList(5)))); // 10
		System.out.println(sumOfMaxAndMin(new ArrayList<>(Arrays.asList(1, 1)))); // 2
		System.out.println(sumOfMaxAndMin(new ArrayList<>())); // 0
		System.out.println(sumOfMaxAndMin(new ArrayList<>(Arrays.asList(1, 2, 3, 9, 5, 0, -2, 11)))); // 9
	}
	
	/*
	 * return sum of smallest and biggest elements.
	 * the list size is 0 return 0
	 * 
	 * sumOfMaxAndMin([1, 2, 3, 9, 5]) -> 10
	 * sumOfMaxAndMin([5]) -> 10
	 * sumOfMaxAndMin([1, 1]) -> 2
	 * sumOfMaxAndMin([]) -> 0
	 * sumOfMaxAndMin([1, 2, 3, 9, 5, 0, -2, 11]) -> 9
	 */
	public static int sumOfMaxAndMin(List<Integer> list) {
		if (list.size() == 0) {
			return 0;
		}
		
		int max = list.get(0);
		int min = list.get(0);
		
		for (int num : list) {
			if (max < num) {
				max = num;
			}
			
			if (min > num) {
				min = num;
			}
		}
		
		return max + min;
	}
}
