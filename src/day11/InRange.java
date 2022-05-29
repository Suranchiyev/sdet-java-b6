package day11;

public class InRange {
	public static void main(String[] args) {
		System.out.println(inRange(8)); // false
		System.out.println(inRange(10)); // true
		System.out.println(inRange(15)); // true
		System.out.println(inRange(17)); // true
		System.out.println(inRange(20)); // true
		System.out.println(inRange(21)); // false
		System.out.println(inRange(100)); // false
	}
	
	// 10, 11 ... 19, 20
	// if number argument within the range from 10 to 20 inclusive return true
	// otherwise return false
	// We use logical operators to connect our conditions together
	public static boolean inRange(int number) {
		// AND - &&
		//      17 >= 10 AND 17 <= 20 
		if (number >= 10 && number <= 20) {
			return true;	
		} else {
			return false;
		}
	}
	
	// BREAK TILL 10:14AM EST
}
