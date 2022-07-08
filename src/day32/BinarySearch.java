package day32;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] num = {6, 3, 2, 10, 0, 7, 5};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num)); 
		
		//  0  1  2  3  4  5  6  
		// [0, 2, 3, 5, 6, 7, 10]
		int res = binarySearch(6, num);
		System.out.println("Index of target number: " + res); // 4
		
		// if target number is not there return -1
		res = binarySearch(8, num);
		System.out.println("Index of target number: " + res); // -1
		
		System.out.println("-----------");
		// Use Arrays.binarySearch() in your prod code
		res = Arrays.binarySearch(num, 6);
		System.out.println(res);
		
		res = Arrays.binarySearch(num, 8);
		System.out.println(res);
	}

	/*
		Repeat until the (sub)array is of size 0:
		- Calculate the middle point of the current (sub)array.
		- If the target is at the middle, stop.
		- Otherwise, if the target is less than what’s at the middle, repeat,
		  changing the end point to be just to the left of the middle.
		- Otherwise, if the target is greater than what’s at the middle, repeat,
	      changing the start point to be just to the right of the middle.
	*/
	public static int binarySearch(int target, int[] arrNum) {
		int start = 0;
		int end = arrNum.length - 1;
		int middle = (start + end) / 2;
		
		while (arrNum[middle] != target) {
			// if start cross the end -> the target is not there
			if (start > end) {
				return -1;
			}
			
			// if middle value is less than target
			// then ignore left side of the (sub)array
			if (arrNum[middle] < target) {    
				start = middle + 1;
			}
			
			// if middle value is greater than target
			// then ignore right side of the (sub)array
			if (arrNum[middle] > target) {
				end = middle - 1;
			}
			
			// recalculate middle with new start or end
			middle = (start + end) / 2;
		}
		
		return middle;
	}
}
