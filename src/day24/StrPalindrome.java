package day24;

public class StrPalindrome {
	public static void main(String[] args) {
		System.out.println(isPal2("civic")); // true
		System.out.println(isPal2("anna")); // true
		System.out.println(isPal2("apple")); // false
		System.out.println(isPal2("level")); // true
		System.out.println(isPal2("hello world")); // false
	}
	
	public static boolean isPal2(String str) {
		int end = str.length() - 1;

		for (int start = 0; start < str.length() / 2; start++) {
			char leftChar = str.charAt(start);
			char rightChar = str.charAt(end);

			if (leftChar != rightChar) {
				return false;
			}
			
			end--;
		}
		
		return true;
	}
	
	/*
	 * return true if str is palindrome otherwise false
	 * isPal("civic");       -> true
	 * isPal("anna");        -> true
	 * isPal("apple");       -> false
	 * isPal("level"); 	     -> true
	 * isPal("hello world"); -> false
	 * 
	 * 1. reverse string
	 * 2. compare strings
	 *    if they are equal then is true otherwise false
	 */
	public static boolean isPal(String str) {
		String strRev = "";
         
		for (int i = str.length() - 1; i >= 0; i--) { 
			strRev += str.charAt(i);
		}

		return strRev.equals(str);
	}
	
	
}











