package homework;

public class StrReviewTwo {
	public static void main(String[] args) {
		System.out.println(isFirstLetterUpperCase("Hello")); // true
		System.out.println(isFirstLetterUpperCase("Apple")); // true
		System.out.println(isFirstLetterUpperCase("APPLE")); // true
		System.out.println(isFirstLetterUpperCase("apple")); // false
		System.out.println(isFirstLetterUpperCase("aPPLE")); // false
		System.out.println(isFirstLetterUpperCase("Hello World!")); // true
		
//		System.out.println(isFirstLetterUpperCase("123")); 
//		System.out.println(isFirstLetterUpperCase("$#")); 
//		System.out.println(isFirstLetterUpperCase("a")); 
//		System.out.println(isFirstLetterUpperCase(""));
		// System.out.println(isFirstLetterUpperCase(null));
		
		System.out.println("---------------");
		System.out.println(verifyPrice("The price of car is $500 buy now"));
		System.out.println(verifyPrice("New price is now $99 buy now"));
		System.out.println(verifyPrice("$84 is last price"));
		
		System.out.println(verifyPrice("The price of car is $10000 buy now"));
		System.out.println(verifyPrice("New price is now $0 buy now"));
		System.out.println(verifyPrice("last price $2000 get now"));
		
		// what if there is no $ sign? 
		// what if the price is last part of the String?
		// what if there is no space?
		// what if there is multiple prices?
		// what if there are multiple spaces?
		
	}
	
	/* 
	 * price is always goes after $ sign and it is never last part of the string
	 * Get price and make sure it is from 1 till 1000 inclusive
	 * if yes true
	 * otherwise false
	 *              012345678          1112..      29
	 * verifyPrice("The price of car is $500 buy now")
	 * verifyPrice("New price is now $99 buy now")
	 * verifyPrice("$84 is last price")
	 * 
	 * indexOf(signleChar) -> it returns index of input character (if there is no input char -1)
	 * indexOf(string)     -> it returns first index of the string (if there is no input string -1)
	 */
	public static boolean verifyPrice(String priceMsg) {
		int dollarSignIndex = priceMsg.indexOf("$");
		int endOfPriceIndex = priceMsg.indexOf(" ", dollarSignIndex);
		String price = priceMsg.substring(dollarSignIndex + 1, endOfPriceIndex);
		int priceNumeric = Integer.parseInt(price);
		
		return priceNumeric >= 1 && priceNumeric <= 1000;	
	}
	
	/*
	 * return true if first letter is upper case otherwise return false
	 * isFirstLetterUpperCase("Hello") -> true
	 * isFirstLetterUpperCase("Apple") -> true
	 * isFirstLetterUpperCase("APPLE") -> true
	 * isFirstLetterUpperCase("apple") -> false
	 * isFirstLetterUpperCase("aPPLE") -> false
	 * isFirstLetterUpperCase("Hello World!") -> true
	 */
	public static boolean isFirstLetterUpperCase(String str) {
		// 1. Get first char as string - substring
		// 2. Make copy of first char string and make it to upper case
		// 3. Compare them if they are equal return true otherwise false
		
		String firstStr = str.substring(0, 1);
		String upperFirstStr = firstStr.toUpperCase();
		return firstStr.equals(upperFirstStr);
	}
}
