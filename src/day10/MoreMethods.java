package day10;

public class MoreMethods {
	public static void main(String[] args) {
		printMin(4, 8); // 4
		printMin(77, 32); // 32
		System.out.println("-----");
		
		System.out.println(getMax(99, 65)); // 99
		
		System.out.println(getMax(43, 77)); // 77
	}
	
	public static void printMin(int i, int i2) {
		if (i < i2) {
			System.out.println(i);
		} else {
			System.out.println(i2);
		}
	}
	
	public static int getMax(int i, int i2) {
		if (i > i2) {
			return i;
		} else {
			return i2;
		}
	}
}
