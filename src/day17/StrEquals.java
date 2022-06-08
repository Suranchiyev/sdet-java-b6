package day17;

public class StrEquals {
	public static void main(String[] args) {
		// equals(String value) 
		// we use equals method to compare two strings on equality
		
		String str = "apple";
		String strTwo = "Apple";
		System.out.println(str + " and " + strTwo);
		
		if (str.equals(strTwo)) {
			System.out.println("are equal");
		} else {
			System.out.println("are not equal");
		}
		System.out.println("-------");
		
		isEqualIngoreTheCase2("Apple", "apple");
		isEqualIngoreTheCase2("banana", "apple");
		
		// we compare primitives with ==
		// primitives: byte, short, int, long, double, float, boolean, char
	}
	
	public static void isEqualIngoreTheCase2(String str, String strTwo) {
		//  "apple"              "Apple" -> true
		if (str.equalsIgnoreCase(strTwo)) {
			System.out.println("equal!");
		} else {
			System.out.println("not equal!");
		}
	}
	
	public static void isEqualIngoreTheCase(String str, String strTwo) {
		str = str.toLowerCase();
		strTwo = strTwo.toLowerCase();
		
		if (str.equals(strTwo)) {
			System.out.println("equal!");
		} else {
			System.out.println("not equal!");
		}
	}
}
