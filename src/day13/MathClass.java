package day13;

public class MathClass {
	public static void main(String[] args) {
		// java.lang package will be import automatically
		
		// java.lang.Math is helper class for some math manipulations.
		// It has many useful methods.
		
		// Math.abs(int number) returns absolute(positive) value of its parameter.
		
		int num = Math.abs(10);
		int numTwo = Math.abs(-10);
		
		System.out.println(num);
		System.out.println(numTwo);
		
		System.out.println(getDiff(40, 20)); // 20
		System.out.println(getDiff(20, 40)); // 20
		System.out.println("-------");
		
		// Math.ceil(double d) rounds a decimal point value to the bigger integer value
		double dNum = 3.01;
		double dNumCeil = Math.ceil(dNum); // round up
		System.out.println(dNumCeil); // 4.0
		
		// Math.floor(double d) rounds a decimal point value to the nearest smaller integer value
		double dNum2 = 8.99;
		double dNum2Floor = Math.floor(dNum2); // round down
		System.out.println(dNum2Floor); // 8.0
		
		// Math.round(double d) rounds to the nearest integer
		double dNum3 = 23.445;
		double dNum3Round = Math.round(dNum3);
		System.out.println(dNum3Round); // 23.0
		
		System.out.println(Math.round(23.545)); // 24
		
		// when the value is in the middle, Math.round() will round up.
		System.out.println(Math.round(23.5)); // 24
		System.out.println("---------");
		
		// Math.min(int i, int i2); -> returns smallest argument
		// Math.max(int i, int i2); -> returns biggest argument
		int i = 9;
		int i2 = 7;
		int resMin = Math.min(i, i2);
		System.out.println(resMin); // 7
		
		int resMax = Math.max(i, i2);
		System.out.println(resMax); // 9
	}
	
	public static int getDiff(int num, int num2) {
		return Math.abs(num - num2);
	}	
}
