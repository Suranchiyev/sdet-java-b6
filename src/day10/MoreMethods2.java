package day10;

public class MoreMethods2 {

	public static void main(String[] args) {
		bigNum(100); // 100 is regular number
		bigNum(2000); // 2000 is big number
		bigNum(1000); // 1000 is big number
		bigNum(12); // 12 is regular number

		System.out.println("--------");

		System.out.println(isBadNumber(5)); // false
		System.out.println(isBadNumber(7)); // true
		System.out.println(isBadNumber(12)); // false
		System.out.println(isBadNumber(13)); // true
		System.out.println(isBadNumber(99)); // true
	}

	public static void bigNum(int number) {
		// TODO
		// if number argument is greater or equal to 1000
		// then print:
		// <number> is big number
		// otherwise print:
		// <number> is regular number

		if (number >= 1000) {
			System.out.println(number + " is big number");
		} else {
			System.out.println(number + " is regular number");
		}
	}

	public static boolean isBadNumber(int number) {
		// TODO
		// 13, 7, 99 are bad numbers
		// if argument number is bad number then return true
		// otherwise return false

		if (number == 13) {
			return true;
		}

		if (number == 7) {
			return true;
		}

		if (number == 99) {
			return true;
		}

		return false;
	}
	// Ctr + Shift + F
}
