package day6;

public class Review {
	public static void main(String[] args) {
		// List all primitive types in Java?
		// There is 8 primitive types in java
		// These primitives represent whole numbers: byte, short, int, long
		// These primitives represent decimal point numbers: float, double
		// This primitive for single character in java: char
		// This primitive for logical values(true or false) only: boolean
		
		int num = 12;
		double score = 78.8;
		char grade = 'A'; // each char has numeric value based on ACII table
		boolean isSunyDay = true;
		
		String firstName = "John";
		int age = 35;
		
		// variable declaration
		// TypeOfVariable nameOfVariable;
		// nameOfVariable = value;
		
		int dayOfLearningJava = 6;
		System.out.println(dayOfLearningJava);
		// long dayOfLearningJava = 12;
		
		// + - * /
		
		int amount = 88;
		//                  88 + 10
		int finalResult = amount + 10;
		System.out.println(finalResult); // 98
		                     // 93
		System.out.println(amount + 5); // 93 
		System.out.println(amount); // 88 
		
		// 93  =   
		amount = amount + 5;
		System.out.println(amount); // 93
		
		amount = amount * 2;
		System.out.println(amount); // 186
		
		// the whole number are only for whole numbers
		// if actual output after math expression is decimal point number 
		// and all whole numbers were involved the result will be truncated 
		// to closest whole number. 
		// 3.9999 -> 3
		// 3.5    -> 3
		System.out.println(7 / 2); // 3
		
		System.out.println(7.0 / 2); // 3.5
		System.out.println(7 / 2.0); // 3.5
		System.out.println(7.0 / 2.0); // 3.5
		
		// whole number / whole number => whole number
		// floating number / whole number => floating number
		// whole number / floating number => floating number
		//      9.0
		double dNum = 9;
		System.out.println("dNum: " + dNum);
		int number = 2;
		
		//      floating number / whole number => 
		//               double / int
		System.out.println(dNum / number); // 4.5
		
	}
}






