package day26;


public class ProjectUtil {
	// sometimes we need methods that don't need object structure
	// we can create them as static
	// static methods and variables belong to class and not to specific object.
	
	// Most of the helper classes will be having static methods
	public static int sum(int num, int num2) {
		return num + num2;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static boolean isStrEvenLength(String str) {
		return str.length() % 2 == 0;
	}
}
