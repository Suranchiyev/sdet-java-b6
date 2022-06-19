package day24;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(revStr("apple")); // elppa
		System.out.println(revStr("abc")); // cba
		System.out.println(revStr("hello")); // olleh
	}
	
	/*
	 * return reverse version of str
	 * revStr("apple"); -> elppa
	 * revStr("abc");   -> cba
	 * revStr("hello"); -> olleh
	 */
	public static String revStr(String str) {
		String strRev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
//			char ch = str.charAt(i);
//			strRev = strRev + ch;
			strRev += str.charAt(i);
		}
		
		return strRev;
	}
}
