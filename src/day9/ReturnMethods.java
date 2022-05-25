package day9;

public class ReturnMethods {
	public static void main(String[] args) {
		//     value = 
		String value = getHello();
		System.out.println(value); // hello world
		
		//                 int
		int result = getNumber();
		System.out.println(result); // 55
	}
	
	public static void sayHello() {
		// void methods can have empty return statement.
		
		// empty return statement usually used to exit from the method.
		return;
		// System.out.println("hello"); Unreachable code
	}
	
	public static double getPrice() {
		String msg = "getting the price";
		System.out.println(msg);
		byte bNum = 4;
		
		// return statement returns the value and exists from the method
		return 99.99;
	}
	
	public static int getNumber() {
		int num = 55;
		return num;
	}
	
	/*
	 * return type of this method is String, it means this method will return String value
	 */
	public static String getHello() {
		String result = "hello class";
		result = "hello world";
		return result;
	}
	
	/*
	 * return type of this method is void, it means it will not return a value
	 */
	public static void printHello() {
		System.out.println("hello");
	}
}
