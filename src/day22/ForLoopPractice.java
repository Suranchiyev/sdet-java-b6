package day22;

public class ForLoopPractice {
	public static void main(String[] args) {
		printHello(5); 
		System.out.println("=========");
		
		printNumbers(5); // 0 1 2 3 4 5
		printNumbers(3); // 0 1 2 3
		printNumbers(10); // 0 1 2 3 4 5 6 7 8 9 10
		System.out.println("=========");
		
		printNumbersRev(5); // 5 4 3 2 1 0
		printNumbersRev(3); // 3 2 1 0
		printNumbersRev(10); // 10 9 8 7 6 5 4 3 2 1 0
	}
	
	/*
	 * print numbers from number till 0 inclusive
	 * printNumbersRev(5); -> 5 4 3 2 1 0
	 * printNumbersRev(3); -> 3 2 1 0
	 * printNumbersRev(10); -> 10 9 8 7 6 5 4 3 2 1 0
	 */
	public static void printNumbersRev(int number) {
		for (int i = number; i >= 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/*
	 * print numbers from 0 till number argument inclusive in one line
	 * printNumbers(5); -> 0 1 2 3 4 5
	 * printNumbers(3); -> 0 1 2 3
	 * printNumbers(10); -> 0 1 2 3 4 5 6 7 8 9 10
	 */
	public static void printNumbers(int number) {
		for (int i = 0; i <= number; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	/*
	 * this method should print "Hello" n times
	 * use for loop
	 */
	public static void printHello(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + " Hello");
		}
	}
}
