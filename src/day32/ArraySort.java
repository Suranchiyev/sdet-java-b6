package day32;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		double[] dArr = {99.9, 100.5, 500.1, 50.9};
		System.out.println(Arrays.toString(dArr));
		// We don't have to implement sorting algorithms by ourselves
		
		// We can use sort methods from Arrays helper class
		Arrays.sort(dArr);
		System.out.println(Arrays.toString(dArr));
		
		int[] arrNum = {5, 4, 3, 1, 7};
		System.out.println(Arrays.toString(arrNum));
		Arrays.sort(arrNum);
		System.out.println(Arrays.toString(arrNum));
	}
}
