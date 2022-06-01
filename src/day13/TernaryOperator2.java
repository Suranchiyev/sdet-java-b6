package day13;

import java.util.Random;

public class TernaryOperator2 {
	public static void main(String[] args) {
		// 1. ternary operator returns the value
		//    if condition is true  -> value one
		//    if condition is false -> value two 
		
		// <= condition ? value one : value two;
		
		// lucky numbers: 5, 7, 9
		Random random = new Random();
		int num = random.nextInt(11);

		String msg = num == 5 || num == 7 || num == 9 ? "lucky number" : "regular number";
		System.out.println(num);
		System.out.println(msg); // lucky number
			
	}
}
