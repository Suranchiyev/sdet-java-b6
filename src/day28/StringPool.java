package day28;

public class StringPool {
	public static void main(String[] args) {
		String str = "apple";
		String str1 = "apple";
		
		// when we use new keyword to create string
		// java will not use StringPool
		String str2 = new String("apple");
		String str3 = "banana";
		
		System.out.println(str == str1); // true
		System.out.println(str == str2); // false
		System.out.println(str1 == str2); // false
		System.out.println(str == str3); // false
	}
}
