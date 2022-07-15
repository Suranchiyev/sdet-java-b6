package day35;

public class ReviewWrapperClasses {
	public static void main(String[] args) {
		// Primitives      Wrapper classes (Object version of primitives)
		// byte            Byte 
		// short           Short
		// int             Integer
		// long            Long
		// float           Float
		// double          Double
		// char            Character
		// boolean         Boolean
		
		
		Integer num = 99;
		System.out.println(num);
		
		num += 10;
		System.out.println(num);
		
		// Integer.parseInt(String strNum) 
		// Integer.max()
		// Integer.min()
		// Integer.MAX_VALUE 
		// Integer.MIN_VALUE
		
		System.out.println("byte max value: " + Byte.MAX_VALUE);
		System.out.println("byte min value: " + Byte.MIN_VALUE);
		
		double dNum = 125.5;
		Double dNumTwo = dNum;
		
		Character ch = 'B';
		char chTwo = ch;
	}
}
