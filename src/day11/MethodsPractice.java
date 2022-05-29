package day11;

public class MethodsPractice {
	public static void main(String[] args) {
		myLuckyNumbers3(5); // Not today!
		myLuckyNumbers3(7); // Bingo!
		myLuckyNumbers3(9); // Bingo!
		myLuckyNumbers3(12); // Bingo!
		myLuckyNumbers3(13); // Not today!
		myLuckyNumbers3(99); // Not today!
	}

	/*
	 * if number is 7 or 9 or 12 then print "Bingo!" otherwise print "Not today!"
	 */
	public static void myLuckyNumbers(int number) {
		// 7 == 7
		if (number == 7 || number == 9 || number == 12) {
			System.out.println("Bingo!");
		} else {
			System.out.println("Not today!");
		}
	}

	public static void myLuckyNumbers2(int number) {
		if (number != 7 && number != 9 && number != 12) {
			System.out.println("Not today!");
		} else {
			System.out.println("Bingo!");
		}
	}

	public static void myLuckyNumbers3(int number) {
		if (!(number == 7 || number == 9 || number == 12)) {
			System.out.println("Not today!");
		} else {
			System.out.println("Bingo!");
		}
	}
}
