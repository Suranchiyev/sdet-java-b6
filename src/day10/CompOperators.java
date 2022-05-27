package day10;

public class CompOperators {
	public static void main(String[] args) {
		// Comparison operators:
		// == "equal to" compares two primitives on equality
		// != "not equal" checks if two primitives are not equal
		// >, >=
		// <, <=
		
		int i = 12;
		int j = 14;
		
		// when we use comparison operators, the output is always boolean
		boolean isEqual = i == j;
		System.out.println(isEqual);
		
		char ch = 'r';
		char ch1 = 'r';
		System.out.println(ch == ch1); // true
		
		boolean isCharsEqual = ch == ch1;
		System.out.println(isCharsEqual);
		System.out.println("-----------");
		
		i = 4;
		j = 5;
		//            4 not equal to 5 -> true
		System.out.println(i != j); // true
		
		i = 10;
		j = 10;     
		//            10 not equal to 10 -> false
		System.out.println(i != j); // false
		boolean isNotEqual = i != j;
		
		i = 7;
		j = 5;
		//             7 greater than 5 -> true
		boolean isGreater = i > j;
		System.out.println(isGreater); // true
		
		//              7 less than 5 -> false
		boolean isLessThan = i < j;
		System.out.println(isLessThan); // false
		System.out.println("-----------");
		// >= greater than or equal
		// <= less than or equal
		i = 3;
		j = 3;
		System.out.println(i > j); // false
		System.out.println(i >= j); // true
	}
}







