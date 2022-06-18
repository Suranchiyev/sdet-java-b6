package day23;

public class StrReverse {
	public static void main(String[] args) {
		System.out.println(reverseStr("apple")); // elppa
		System.out.println(reverseStr("john")); // nhoj
		System.out.println(reverseStr("hello world")); // dlrow olleh
	}
	
	/*
	 * reverseStr("apple"); -> "elppa"
	 * reverseStr("john"); -> "nhoj"
	 * reverseStr("hello world"); -> "dlrow olleh"
	 */
	public static String reverseStr(String str) {
		String strRev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev += str.charAt(i);
			// strRev = strRev + str.charAt(i);
		}
	
		return strRev;
	}
	
}
