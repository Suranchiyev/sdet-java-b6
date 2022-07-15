package day34;

import java.util.Arrays;

public class ChangeArrayTwo {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(nums)); // [1, 2, 3, 4, 5]
		
		changeArray(nums);
		System.out.println(Arrays.toString(nums)); // [-7, -7, -7, -7, -7]
		System.out.println("--------");
		
		// primitives don't work with references
		double price = 99.9;
		System.out.println(price); // 99.9
		
		changePrimitive(price);
		System.out.println(price); // 99.9
		System.out.println("--------");
		
		String strNum = "one";
		System.out.println(strNum); // one
		
		changeStr(strNum);
		System.out.println(strNum); // one
		System.out.println("--------");
		
		StringBuilder strBuilder = new StringBuilder("one");
		System.out.println(strBuilder); // one
		changeSb(strBuilder);
		
		System.out.println(strBuilder); // oneABC
	}
	
	public static void changeArray(int[] arrNum) {
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = -7;
		}
	}
	
	public static void changePrimitive(double dNum) {
		// for primitives the argument will be the copy of passed value
		dNum = -7;
	}
	
	public static void changeStr(String str) {
		// str
		str = "minus seven";
	}
	
	public static void changeSb(StringBuilder sb) {
		sb.append("ABC");
	}
}
