package day12;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(getEvenOddTen(4)); // even
		System.out.println(getEvenOddTen(8)); // even
		System.out.println(getEvenOddTen(10)); // ten
		System.out.println(getEvenOddTen(5)); // odd
		System.out.println(getEvenOddTen(11)); // odd
	}
	
	/*
	 * number % 2 == 0 
	 * if number is even method should return "even" except when number is 10 
	 * method should return "ten"
	 * for any other numbers return "odd"
	 */
	public static String getEvenOddTen(int number) {
		if (number % 2 == 0 && number != 10) {
			return "even";
		}
		
		if (number == 10) {
			return "ten";
		}
		
		return "odd";
	}
}
