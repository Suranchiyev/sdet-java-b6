package day31;

import java.util.Arrays;

public class StrAndChars {
	public static void main(String[] args) {
		//            01234
		String str = "hello";
		
		// ['h', 'e', 'l', 'l', 'o']
		char[] chArr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}
		
//		chArr[0] = str.charAt(0);
//		chArr[1] = str.charAt(1);
//		chArr[2] = str.charAt(2);
//		chArr[3] = str.charAt(3);
//		chArr[4] = str.charAt(4);
		System.out.println(Arrays.toString(chArr));
		System.out.println("-----------");
		
		String strTwo = "Apple";
		//                "Apple" -> [A, p, p, l, e]
		char[] chArrTwo = strTwo.toCharArray();
		System.out.println(strTwo);
		System.out.println(Arrays.toString(chArrTwo));
		System.out.println("-----------");
		
		String strThree = "Banana";
		// How many 'a' or 'A' in my strThree string?
		int count = 0;

		for (char ch : strThree.toCharArray()) {
 			if (ch == 'a' || ch == 'A') {
				count++;
			}
		}
		
		System.out.println("Number of A/a in out string: " + count);
	}
}
