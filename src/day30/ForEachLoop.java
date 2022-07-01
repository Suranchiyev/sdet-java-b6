package day30;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] numArr = {1, 3, 4, 5, 6, 6, 7, 8, 9};
		
//		for (int i = 0; i < numArr.length; i++) {
//			if (numArr[i] == 7) {
//				System.out.println("Yes, 7 is in the array");
//			}
//		}
		
		// for each loop
		//           : [1, 3, 4, 5, 6, 6, 7, 8, 9]
		for (int num : numArr) {
			if (num == 7) {
				System.out.println("Yes, 7 is in the array");
			}
		}
		
		double[] dArrNum = {2.1, 1.7, 8.9, 5.5};
		double sum = 0.0;
		for (double element : dArrNum) {
			System.out.println(element);
			sum += element;
		}
		System.out.println("Sum: " + sum);
		
		
		String[] nameArr = {"Agatha", "Aidar", "Anne", "Anna", "Ayuna"};
		for (String name : nameArr) {
			System.out.println(name);
		}
		// BREAK TILL 9:14PM EST
	}
}
