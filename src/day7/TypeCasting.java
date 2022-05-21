package day7;

public class TypeCasting {
	public static void main(String[] args) {
		// byte -> short -> int -> long -> float -> double
		 
		// implicit casting 
		// widening primitive conversion
		byte bNum = 50;
		int intNum = bNum; // implicit casting
		System.out.println(intNum); // 50
		
		short shNum = 299;
		long lNum = shNum;
		System.out.println(lNum); // 299
		
		long longNum = 100000;
		float floatNum = longNum;
		double doubleNum = floatNum;
		System.out.println(doubleNum); // 100000.0
		
		// byte -> short -> int -> long -> float -> double
		
		// explicit casting
		// narrowing primitive conversion
		// A narrowing primitive conversion may lose information about
		// the overall magnitude of a numeric value
		
		double dinnerBill = 99.99;
		// when we cast floating number to whole number the decimal points will be truncated
		int finalBill = (int)dinnerBill;
		System.out.println(finalBill); // 99
		//               
		long longValue = 5000L;
		int intValue = (int)longValue;
		System.out.println(intValue);
		
		int number = 1000;
		// -128 to 127
		
		// -128 -127 -126 ... -1 0 1 2 3 ... 127
		// 128 + 128 = 256
		int totalStorageOfByte = 256;
		System.out.println(((number - 128) % totalStorageOfByte) - 128);
		
		// if we have bigger value than the range of the type we are casting to
		// then we will get unexpected value
		byte byteValue = (byte)number;
		System.out.println(byteValue); // -24
	}
}




