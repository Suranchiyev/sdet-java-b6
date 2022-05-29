package day11;

public class LogicalOperators {
	public static void main(String[] args) {
		// && -> AND
		// || -> OR
		// !  -> NOT
		// Why do we need logical operators?
		// To connect the conditions together
		
		int number = 12;
		// check if this number is within 5 and 15
		// number > 5 and number < 15
		
		//        true AND true -> true
		if (number > 5 && number < 15) {
			System.out.println("within the range.");
		}
		// when && (AND) logical operator is used, to get true, all conditions should be true
		
		boolean b = true && true && true && false;
		System.out.println(b); // false
		
		number = 15;
		// if number is 7 or 9 or 15 then print my lucky numbers
		//        false OR       false OR true -> true
		if (number == 7 || number == 9 || number == 15) {
			System.out.println("My lucky number");
		}
		
		// when || (OR) logical operator is used, to get true, at least one of the conditions should be true
		// as long as one condition is true, the whole condition will be true.
		boolean b1 = false || true || false || false;
		System.out.println(b1); // true
		
		// ! - logical NOT
		// it reverses the value of boolean
		boolean b2 = !false;
		System.out.println(b2); // true
		
		if (!(5 > 7)) {
			System.out.println("true here");
		}
		System.out.println("-------");
		
		// false || true -> true
		// false && true -> false
		// !true         -> false
		// !false        -> true
		
		//                                
		//                       	true      AND true -> true
		boolean conditionOne = 2 == 1 || true && 4 >= 3;
		System.out.println(conditionOne); // true
		
		//                         t and t -> true
		boolean conditionTwo = !false && true;
		System.out.println(conditionTwo); // true
		
		// literal type of whole number is int
		//                                 true              OR false -> true
		boolean conditionThree = 20 % 2 == 0 && !(5 / 2 <= 2) || 4 % 2 == 1;
		System.out.println(conditionThree); // false		
	}
}










