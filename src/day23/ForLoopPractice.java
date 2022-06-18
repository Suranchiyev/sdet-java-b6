package day23;

public class ForLoopPractice {
	public static void main(String[] args) {
		printEvenNumbers(10); // 2 4 6 8 10
		printEvenNumbers(20); // 2 4 6 8 10 12 14 16 18 20
		printEvenNumbers(5); // 2 4
		printEvenNumbers(3); // 2
		System.out.println("--------");
		
		System.out.println(getSum(5)); // 15
		System.out.println(getSum(3)); // 6
		System.out.println(getSum(10)); // 55
	}
	
	/*
	 * return sum of all number from 1 till num inclusive
	 * getSum(5); -> 1 + 2 + 3 + 4 + 5 => 15
	 * getSum(3); -> 1 + 2 + 3 => 6
	 * getSum(10); -> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 => 55
	 */
	public static int getSum(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			// sum = sum + i;
			sum += i;
		}
		
		return sum;
	}
	
	/*
	 * print even only numbers from 1 till number inclusive in one line
	 * printEvenNumbers(10); // 2 4 6 8 10
	 * printEvenNumbers(20); // 2 4 6 8 10 12 14 16 18 20
	 * printEvenNumbers(5);  // 2 4
	 * printEvenNumbers(3);  // 2
	 */
	public static void printEvenNumbers(int number) {
		
		for (int i = 2; i <= number; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
