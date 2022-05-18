package day5;

public class PrimitivesInJava {
	public static void main(String[] args) {
		// There are 8 primitives in java:
		// byte, short, int, long - the whole numbers
		// float, double - the floating numbers
		// char - single char between ''
		// boolean - for logical values (true or false)
		
		String name = "John";
		int age = 29;
		System.out.println("--------");
		
		// whole numbers:
		// -128 to 127
		byte bNum = 10;
		short shNum = 120;
		int num = 99;
		long lNum = 14328945234L;
		
		// the default literal type of whole number is always int 
		System.out.println(99);
		
		// floating numbers:
		double dNum = 99.99;
		float fNum = 1.9F;
		
		double price = 15.78;
		
		// the default literal type of floating number is double
		System.out.println(5.5);
		
		// char - for single character
		char ch = 'H';
		System.out.println(ch); // H
		// each char has numeric value mapped from ACII table
		System.out.println(ch + 0); // 72
		
		char ch1 = 73;
		System.out.println(ch1);
		
		// boolean - data type for logical values (true or false)
		boolean isTimeForBreak = false;
		isTimeForBreak = true;
	}
}




