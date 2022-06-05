package day15;

public class StrUpperLowerCase2 {
	public static void main(String[] args) {
		System.out.println(changeStr("Abcdef")); // ABCDEF
		System.out.println(changeStr("Abc")); // abc
		System.out.println(changeStr("Beknazar")); // BEKNAZAR
		System.out.println(changeStr("John")); // john
	}
	
	/*
	 * if str argument length is greater than 5 return all in upper cases
	 * otherwise return all in lower cases
	 * 1. find out length of the string .length()
	 * 2. if else or ternary to return in upper case or lower case
	 *    use toUpperCase() or toLowerCase()
	 */
	public static String changeStr(String str) {
		int strLength = str.length();
		
		if (strLength > 5) {
			return str.toUpperCase();
		} else {
			return str.toLowerCase();
		}
	}
	
	public static String changeStr2(String str) {
		return str.length() > 5 ? str.toUpperCase() : str.toLowerCase();
	}
}
