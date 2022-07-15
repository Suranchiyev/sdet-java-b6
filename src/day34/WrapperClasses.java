package day34;

public class WrapperClasses {
	public static void main(String[] args) {
		// byte, short, int, long
		// float, double
		// char
		// boolean
		
		// Wrappers classes are object representation of primitives in Java.
		byte bNum = 10;
		Byte bNumObj = 10;
		
		short shNum = 100;
		Short shNumObj = 100;
		
		int iNum = 999;
		Integer iNumObj = 999;
		
		// Why?
		// Because java has a features that work only with objects. For example
		// collections in java, generics, some multi-threading.
		
		Long lNumber = 999999L;
		Float fNum = 8.9F;
		Double dNum = 99.99;
		Character ch = 'A';
		Boolean isTrue = false;
		
		System.out.println("-------");
		// Wrapper classes have some useful methods
		int num = Integer.parseInt("123");
		
		System.out.println("The max value int can hold: " + Integer.MAX_VALUE);
		System.out.println("The min value int can hold: " + Integer.MIN_VALUE);
		
		int i = 9;
		int i2 = 7;
		int res = Integer.max(i, i2);
		System.out.println(res);
	}
}
