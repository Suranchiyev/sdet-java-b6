package day10;

public class MoreMethods3 {
	public static void main(String[] args) {
		luckyNumbers(1); // Not today
		luckyNumbers(5); // Not today
		luckyNumbers(7); // I got lucky number
	}
	
	public static void luckyNumbers(int num) {
		// 7 is lucky numbers
		// if argument num is lucky number, print "I got lucky number"
		// otherwise print "Not today"
		
		// equal to
		//  7 == 7
		if (7 == num) {
			System.out.println("I got lucky number");
		} else {
			System.out.println("Not today");
		}
	}
}
