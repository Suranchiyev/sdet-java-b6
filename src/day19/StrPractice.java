package day19;

public class StrPractice {
	public static void main(String[] args) { 
		System.out.println(isEven("java")); // true
		System.out.println(isEven("Hello")); // false
		System.out.println(isEven("Abcdxf")); // true
		System.out.println(isEven("abc")); // false
		System.out.println("----------");
		
		System.out.println(getLengthWithoutSpace("Java")); // 4
		System.out.println(getLengthWithoutSpace("Java great")); // 9
		System.out.println(getLengthWithoutSpace("  ")); // 0
 		System.out.println(getLengthWithoutSpace("a b c")); // 3
		System.out.println(getLengthWithoutSpace("abc")); // 3
		System.out.println("----------");
		
		System.out.println(isUpperCase("JAVA")); // true
		System.out.println(isUpperCase("Java")); // false
		System.out.println(isUpperCase("ABC")); // true
		System.out.println(isUpperCase("Apple")); // false
		System.out.println(isUpperCase("python")); // false
	}
	
	/*
	 * return true if str is in upper cases otherwise false
	 * isUpperCase("JAVA")  -> true
	 * isUpperCase("Java")  -> false
	 * isUpperCase("ABC")   -> true
	 * isUpperCase("Apple") -> false
	 */
	public static boolean isUpperCase(String str) {
		String strUpper = str.toUpperCase();
		return str.equals(strUpper);
	}
	
	/*
	 * return length of str ignoring the white spaces
	 * getLengthWithoutSpace("Java")       -> 4
	 * getLengthWithoutSpace("Java great") -> 9
	 * getLengthWithoutSpace("  ")         -> 0
	 * getLengthWithoutSpace("a b c")      -> 3
	 * getLengthWithoutSpace("abc")        -> 3
	 * 1. replace the space with empty string 
	 * 2. get the length
	 */
	public static int getLengthWithoutSpace(String str) {
		str = str.replace(" ", "");
		return str.length();
	}
	
	/*
	 * if str length is even return true otherwise return false
	 * isEven("java")    -> true
	 * isEven("Hello")   -> false
	 * isEven("Abcdxf")  -> true
	 * isEven("abc")     -> false
	 */
	public static boolean isEven(String str) {
//		int len = str.length();
//		if (len % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}	
		return str.length() % 2 == 0;
	}	
}
