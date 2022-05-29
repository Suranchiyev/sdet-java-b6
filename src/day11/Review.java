package day11;

public class Review {
	public static void main(String[] args) {
		// Comparison operators:
		// ==      - equal to
		// !=      - not equal
		// >, >=   - greater than
		// <, <=   - less than
		
		// == to compare values of two primitives on equality
		int number = 10;
		int numberTwo = 12;
		//    10 equal to 12 -> false
		if (number == numberTwo) {
			System.out.println("Yes, they are equal");
		} else {
			System.out.println("No, they are not equal");
		}
		
		//  10 not equal to 12 -> true
		if (number != numberTwo) {
			System.out.println("Not equal!");
		}
		
		//      10 <= 12
		if (number <= numberTwo) {
			System.out.println(number + " is less than or equal to " + numberTwo);
		}
		
		//      10 >= 12 -> false
		if (number >= numberTwo) {
			System.out.println(number + " is greater than or equal to " + numberTwo);
		}
		
		System.out.println("-----");
		char ch = 'a';
		char ch2 = 'b';
		// all compare conditions return boolean(true or false)
		//                    false
		boolean charEqual = ch == ch2;
		if (charEqual) {
			System.out.println(ch + " is equal to " + ch2); 
		} else {
			System.out.println(ch + " is not equal to " + ch2);
		}
			
	}
}




