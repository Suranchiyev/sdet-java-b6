package day17;

public class StrCharAt {
	public static void main(String[] args) {
		// charAt(int index) returns char at that specific index
		//            01234
		String str = "home";
		//  'o'
		char ch = str.charAt(1);
		
		System.out.println(str); // home
 		System.out.println(ch); // o
 		
 		char chTwo = str.charAt(2);
 		System.out.println(chTwo); // m
 		
 		char chThree = str.charAt(0);
 		System.out.println(chThree); // h
 		
 		// System.out.println(str.charAt(4)); // StringIndexOutOfBoundsException
 		// System.out.println(str.charAt(-1)); // StringIndexOutOfBoundsException
 		System.out.println("----------");
 		// last index = length() - 1
 		printFirstAndLast("hello"); // ho
 		printFirstAndLast("apple"); // ae
 		printFirstAndLast("Java"); // Ja
 		printFirstAndLast("Tech Lead Academy"); // Ty
	}
	
	/*
	 * print first and last character from str argument(by using charAt)
	 * printFirstAndLast("hello") -> ho
	 * printFirstAndLast("apple") -> ae
	 * printFirstAndLast("Java")  -> Ja
	 * printFirstAndLast("Tech Lead Academy") -> Ty
	 */
	public static void printFirstAndLast(String str) {
		// 1. get first char charAt(0)
		// 2. get second char charAt(str.length() - 1)
		// 3. print them together first + second
		
		char firstLetter = str.charAt(0);
		char lastLetter = str.charAt(str.length() - 1);
		// ACII
		String res = firstLetter + "" + lastLetter;        
		System.out.println(res);
	}
}






