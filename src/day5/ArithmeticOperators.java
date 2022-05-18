package day5;

public class ArithmeticOperators {
	public static void main(String[] args) {
		// + - * /
		// byte, short, int, long => whole numbers
		// float, double
		
		int i = 7;
		int j = 2;
		int result;
		//   9 = 7 + 2
		result = i + j;
		System.out.println("result = " + result);
		
		//       7 - 2
		result = i - j;
		System.out.println("result = " + result);
		
		//  14 = 7 * 2
		result = i * j;
		System.out.println("result = " + result);
		
		//   3 = 7 / 2 
		result = i / j;
		System.out.println("result = " + result); 
		//                int / int => int
		double resDouble = i / j;
		System.out.println(resDouble);

		// byte -> short -> int -> long -> float -> double
		short d = 2;
		int num = 5;
		System.out.println(num / d); // 2
		
		
		String str = "Result: ";
		int myNumber = 299;
		int myNumber3 = 1;
		//                 "Result: 300"
		System.out.println(str + (myNumber + myNumber3)); 
		// Result: 300
		// Result: 2991
		System.out.println(myNumber + myNumber3 + str);
	}
}
