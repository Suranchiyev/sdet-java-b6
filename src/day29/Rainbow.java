package day29;

public class Rainbow {
	public static void main(String[] args) {
		String[] color = {"red", "orange", "yellow", "green", "blue", "indigo", "violet", "white"};
		
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}
		System.out.println("---------");
		
		int[] numbers = {5, 7, 8, 9, 1, 4, 1, 2, 3, 87, 65, 21};
		printEachElement(numbers); // 5 7 8 9 1 4 1 2 3 87 65 21
		
		numbers = new int[] {1, 2, 3, 4};
		printEachElement(numbers); // 1 2 3 4
	}
	/*
	 * print each element of array in the same line seperated by space
	 */
	public static void printEachElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
