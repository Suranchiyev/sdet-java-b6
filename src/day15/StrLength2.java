package day15;

public class StrLength2 {
	public static void main(String[] args) {
		evenOrOddLength2("hello"); // odd length
		evenOrOddLength2("java"); // even length
		evenOrOddLength2("xyz"); // odd length
	
	}
	
	/*
	 * if str argument length is even print "even length"
	 * otherwise print "odd length"
	 * 1. get number of char of str by using .length() method
	 * 2. find out if it is even or odd by using len % 2 == 0
	 */
	public static void evenOrOddLength(String str) {
		int sizeOfStr = str.length();
		
		if (sizeOfStr % 2 == 0) {
			System.out.println("even length");
		} else {
			System.out.println("odd length");
		}
	}
	
	public static void evenOrOddLength2(String str) {
		String msg = str.length() % 2 == 0 ? "even length" : "odd length";
		System.out.println(msg);
	}
}
