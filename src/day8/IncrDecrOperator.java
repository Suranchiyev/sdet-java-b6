package day8;

public class IncrDecrOperator {
	public static void main(String[] args) {
		int number = 5;
		System.out.println(number);
		
		number = number + 1;
		System.out.println(number); // 6
		
		number += 1;
		System.out.println(number); // 7
		
		number++; // post increment operator will increase value by 1
		System.out.println(number); // 8
		
		number--; // post decrement operator will decrease value by 1 
		System.out.println(number); // 7	
		
		++number; // pre increment operator will increase value by 1
		System.out.println(number); // 8
		
		--number;
		System.out.println(number); // 7
		System.out.println("----------");
		
		// post will have effect only when variable is used next time
		// pre will have effect right away.
		
		int age = 30;
		
		System.out.println(age++); // 30 because of post increment
		System.out.println(age); // 31
		System.out.println(++age); // 32 because of pre increment
		System.out.println("----------");
		
		int i = 7;
		int i2 = 4;
		int i3 = 1;
		//                            
		int res = i++ + ++i2 + i3++ - i;
		System.out.println(res); // 5
		// ---
		i = 7;
		i2 = 4;
		i3 = 1;
		//        48 =
		//      6 * 6   + 4    + 5  - 1   *  2  + 5 = 
		res = --i * i++ + i2++ + i2 - i3++ * i3 + i2++;
		System.out.println(res); // 
		// BREAK TILL 11:18AM EST
	}
}
