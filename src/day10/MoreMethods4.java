package day10;

public class MoreMethods4 {
	public static void main(String[] args) {
		System.out.println(getNumStr(0));
		System.out.println(getNumStr(1));
		System.out.println(getNumStr(2));
		System.out.println(getNumStr(3));
		System.out.println(getNumStr(5));
	}
	
	/*
	 * 1 - "one"
	 * 2 - "two"
	 * 3 - "three"
	 * otherwise - "not supported"
	 */
	public static String getNumStr(int num) {
		if (num == 1) {
			return "one";
		}
		
		if (num == 2) {
			return "two";
		}
		
		if (num == 3) {
			return "three";
		}
		
		return "not supported";
	}
}
