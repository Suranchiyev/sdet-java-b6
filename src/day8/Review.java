package day8;

public class Review {
	public static void main(String[] args) {
		// byte -> short -> int -> long -> float -> double
		
		// implicit casting
		byte byteValue = 100;
		int intValue = byteValue;
		System.out.println(intValue);
		
		// explicit casting
		double doubleValue = 500.99;
		int intValue2 = (int)doubleValue;
		System.out.println(intValue2); // 500
		
		// -128 to 127
		byte byteValue2 = (byte)doubleValue;
		System.out.println(byteValue2);
		
		//                    byte   +    double   + int
		System.out.println(byteValue + doubleValue + intValue);
		double output = byteValue + doubleValue + intValue;
	}
}
