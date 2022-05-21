package day7;

public class AssingmentCompatibility {
	public static void main(String[] args) {
		// byte -> short -> int -> long -> float -> double
		
		long lNum = 500L;
		float fNum = 55.99F;
		short shNum = 123;
		
		// What's the data type of this output?
		//                 long + float + short -> float
		System.out.println(lNum + fNum + shNum);
		
		float output = lNum + fNum + shNum;
		System.out.println("output: " + output);
		
		int intValueOne = 100;
		int intValueTwo = 3;
		double dValue = 3.0;
		
		//  * /
		// + -
		//                                       int + double => double
		System.out.println(intValueOne / intValueTwo + dValue);
		//                         int / double => double + int => double
		System.out.println(intValueOne / dValue + intValueTwo);
		
		double outputTwo = intValueOne / intValueTwo + dValue;
		
		// BREAK TILL 11:18AM EST
	}
}
