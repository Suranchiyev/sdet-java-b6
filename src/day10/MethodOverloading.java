package day10;

public class MethodOverloading {
	public static void main(String[] args) {
		int res = sum(9, 1);
		System.out.println(res); // 10
		System.out.println(sum(7, 4)); // 11
		
		System.out.println(sum(4, 5, 6)); 
		
		System.out.println(sum(5.3, 2.3)); 
		
		double d1 = 9.9;
		double d2 = 1.0;
		System.out.println(sum(d1, d2));	
	}
	
	// Method overloading is when we have multiple methods with same name but different arguments:
	// - different number of arguments
	// - different type of argument/s
	
	public static int sum(int i, int i2) {
		return i + i2;
	}
	
	public static int sum(int i, int i2, int i3) {
		return i + i2 + i3;
	}
	
	public static double sum(double d, double d2) {
		return d + d2;
	}
}
