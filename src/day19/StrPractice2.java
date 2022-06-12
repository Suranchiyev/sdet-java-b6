package day19;

public class StrPractice2 {
	public static void main(String[] args) {
		System.out.println(getFirstHalf("1234")); // 12
		System.out.println(getFirstHalf("Apples")); // App
		System.out.println(getFirstHalf("Beknazar")); // Bekn
		System.out.println(getFirstHalf("Ab")); // A
		System.out.println("------------");
		
		System.out.println(getSecondHalf("1234")); // 34
		System.out.println(getSecondHalf("Apples")); // les
		System.out.println(getSecondHalf("Beknazar")); // azar
		System.out.println(getSecondHalf("Ab")); // b
	}
	
	/*
	 * Assume str will be only even length string
	 * Return first half of the str
	 * getFirstHalf("1234") -> "12"
	 * getFirstHalf("Apples") -> "App"
	 * getFirstHalf("Beknazar") -> "Bekn"
	 * getFirstHalf("Ab") -> "A"
	 */
	public static String getFirstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}
	
	/*
	 * Assume str will be only even length string
	 * Return second half of the str
	 * getFirstHalf("1234") -> "34"
	 * getFirstHalf("Apples") -> "les"
	 * getFirstHalf("Beknazar") -> "azar"
	 * getFirstHalf("Ab") -> "b"
	 */
	public static String getSecondHalf(String str) {
		return str.substring(str.length() / 2);
	}
}
