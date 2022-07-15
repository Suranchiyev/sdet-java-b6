package day34;

import java.util.Arrays;

public class PrimitivesVsObjects {
	public static void main(String[] args) {
		int num = 9;
		int numTwo = num;
		
		System.out.println(num); // 9
		System.out.println(numTwo); // 9
		
		numTwo = 2;
		
		System.out.println(num); // 9
		System.out.println(numTwo); // 2
		System.out.println("------------");
		
		String[] arrStr = {"A", "B", "C"};
		System.out.println(arrStr);
		
		String[] arrStrTwo = arrStr;
		
		System.out.println(Arrays.toString(arrStr));
		System.out.println(Arrays.toString(arrStrTwo));
		
		arrStr[0] = "X";
		
		System.out.println(Arrays.toString(arrStr));
		System.out.println(Arrays.toString(arrStrTwo));
		
		// Primitives just hold their values without any pointers
		// int num = 2;
		// int num2 = num;
		
		// Objects and Arrays work with references
		// Student student = new Student();
		// Student studentTwo = student;
		// studentTwo now is pointing to the same object as student
		
		// String is immutable object and it acts like a primitive.	
		// String str = "Apple";
		// String str2 = str;
		// str2 = "kiwi";
	}
}
