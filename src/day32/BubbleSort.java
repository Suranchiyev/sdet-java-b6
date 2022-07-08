package day32;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numArr = {6, 3, 2, 10, 0, 7, 5};
		System.out.println(Arrays.toString(numArr)); // [6, 3, 2, 10, 0, 7, 5]
		
		bubbleSort(numArr);
		System.out.println(Arrays.toString(numArr)); // [0, 2, 3, 5, 6, 7, 10]
	}
	
	public static void bubbleSort(int[] numArr) {
		int swapCounter = -1;
		int len = numArr.length;
		
		// number of iterations
		while (swapCounter != 0) {
			len--;
			swapCounter = 0;
			
			// it goes over each pair and checks if they are in correct order or not
			for (int i = 0; i < len; i++) {  
				// if two pair elements are not in sorted order, swap them and do swapCounter++
				if (numArr[i] > numArr[i + 1]) {
					int tmp = numArr[i];
					numArr[i] = numArr[i + 1];
					numArr[i + 1] = tmp;
					
					swapCounter++;
				}
			}
			
		}
	}
}
