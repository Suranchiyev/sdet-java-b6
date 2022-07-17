package homework;

public class CreditCard2 {
	public static void main(String[] args) {
		// Note, these examples don't cover full test cases.
		creditCardCheck("378282246310005"); // AMEX
		creditCardCheck("4012888888881881"); // VISA
		creditCardCheck("5105105105105100"); // MASTERCARD
		creditCardCheck("123"); // INVALID
		creditCardCheck("6176292929"); // INVALID
		creditCardCheck("-37828224005"); // INVALID
	}

	public static void creditCardCheck(String creditCard) {
		// 1. VALID NUMBERS
		if (!isNumerics(creditCard)) {
			System.out.println("INVALID");
			return;
		}

		// 2. LUHN'S ALGO
		if (!luhnsAlgoCheck(creditCard)) {
			System.out.println("INVALID");
			return;
		}

		// 3. CARD TYPE
		if (creditCard.length() == 15 && startsWithAll(creditCard, "34", "37")) {
			System.out.println("AMEX");
		} else if (creditCard.length() == 16 && startsWithAll(creditCard, "51", "52", "53", "54", "55")) {
			System.out.println("MASTERCARD");
		} else if ((creditCard.length() == 13 || creditCard.length() == 16) && startsWithAll(creditCard, "4")) {
			System.out.println("VISA");
		} else {
			System.out.println("INVALID");
		}
	}

	public static boolean startsWithAll(String creditCard, String... values) {
		boolean isStartWith = false;
		for (String val : values) {
			if (creditCard.startsWith(val)) {
				isStartWith = true;
			}
		}
		return isStartWith;
	}

	public static boolean isNumerics(String card) {
		for (char ch : card.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

	public static boolean luhnsAlgoCheck(String card) {
		int sum = 0;

		for (int i = card.length() - 2; i >= 0; i -= 2) {
			String strDigit = String.valueOf(card.charAt(i));
			int res = Integer.parseInt(strDigit) * 2;
			if (res > 9) {
				int firstDig = res / 10;
				int secondDig = res % 10;
				sum += firstDig + secondDig;
			} else {
				sum += res;
			}
		}

		for (int i = card.length() - 1; i >= 0; i -= 2) {
			String strDigit = String.valueOf(card.charAt(i));
			sum += Integer.parseInt(strDigit);
		}

		return sum % 10 == 0;
	}
}
