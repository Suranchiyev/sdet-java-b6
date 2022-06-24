package day25;

public class Review {
	public static void main(String[] args) {
		printEachChar("hello");
		System.out.println("-------");
		printEachCharRev("hello");
	}
	
	/*
	 * method should print each char of str in the new lines
	 * printEachChar("hello"); 
	 * h
	 * e
	 * l
	 * l
	 * o
	 */
	public static void printEachChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	/*
	 * method should print each char in reverse order
	 * printEachCharRev("hello");
	 * o
	 * l
	 * l
	 * e
	 * h
	 */
	public static void printEachCharRev(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}
