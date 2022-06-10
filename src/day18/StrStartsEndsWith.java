package day18;

public class StrStartsEndsWith {
	public static void main(String[] args) {
		// startsWith(value)
		// it checks if string starts with given value if yes returns true
		// otherwise returns false
		
		String str = "Java is object-oriented programming language";
		boolean startsWith = str.startsWith("Java is obj");
		System.out.println(startsWith); // true
		
		System.out.println(str.startsWith("is object")); // false
		System.out.println(str.startsWith("Java")); // true
		System.out.println(str.startsWith("Java is object-oriented programming language"));// true
		System.out.println(str.startsWith("John Doe")); // false 
		System.out.println("-----------");
		
		// endsWith(value)
		// it checks if string ends with given value if yes returns true
		// otherwise returns false
		String strTwo = "Selenium is test automation tool";
		System.out.println(strTwo.endsWith("tool")); // true
		System.out.println(strTwo.endsWith("tool ")); // false
		System.out.println(strTwo.endsWith(" automation tool")); // true
		System.out.println(strTwo.endsWith("Selenium is test")); // false
		System.out.println(strTwo.endsWith("Selenium is test automation tool")); // true
	}
}




