package day16;

public class StrSubstring3 {
	public static void main(String[] args) {
		//                                      01234 -> 0, 4
		System.out.println(withoutFirstAndLast("apple")); // ppl
		
		//                                      01234567891011 -> 1, 11
		System.out.println(withoutFirstAndLast("hello, world")); // ello, worl
		
		//                                      0123456789  -> 1, 7
		System.out.println(withoutFirstAndLast("John Doe")); // ohn Do
		
		System.out.println("------------");
		
		// System.out.println(getFirstAndLast("apple")); // ae
		// System.out.println(getFirstAndLast("hello, world")); // hd
		System.out.println(getFirstAndLast("John Doe")); // Je
	}
	
	/*
	 * return argument str without first and last chars
	 */
	public static String withoutFirstAndLast(String str) {
		int len = str.length();
		return str.substring(1, len - 1);
	}
	
	/*
	 * return first char and last char from argument str
	 * getFirstAndLast("apple") -> "ae"
	 * getFirstAndLast("hello, world") -> "hd"
	 * getFirstAndLast("John Doe") -> "Je"
	 * 
	 * 1. get first letter by using substring(0, 1)
	 * 2. get last letter by using substring(str.length() - 1)
	 * 3. concatenate them together and return
	 */
	public static String getFirstAndLast(String str) {
		String firstLetter = str.substring(0, 1);
		String lastLetter = str.substring(str.length() - 1);
		return firstLetter + lastLetter;
	}
}
