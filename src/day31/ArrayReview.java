package day31;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		// Array is fixed sized collection of data of the same type.
		int[] nums = new int[10];
		 
		// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println(Arrays.toString(nums)); 
		
		String[] strs = new String[5];
		System.out.println(Arrays.toString(strs));
		
		strs[0] = "apple";
		strs[4] = "kiwi";
		//    0     1     2      3     4
		// [apple, null, null, null, kiwi]
		System.out.println(Arrays.toString(strs));
		
		System.out.println("Size: " + strs.length);
		System.out.println("--------");
		
		byte[] bArray = {4, 3, 2, 7, 8, 10};
		System.out.println(Arrays.toString(bArray));
		
		bArray = new byte[] {5, 5, 5};
		double[] dArray = new double[] {9.9, 9.1, 2.4, 5.5};
	}
}
