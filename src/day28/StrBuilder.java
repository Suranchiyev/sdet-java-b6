package day28;

public class StrBuilder {
	public static void main(String[] args) {
		String str = "";
		
		for (int i = 1; i <= 100; i++) {
			//    "12"
			str = str + i;
		}
		System.out.println(str); // "12345678910....100"
		// How many objects of String we created in above program?
		// 101
		
		// Java provides mutable StringBuilder class to resolve above issue.
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i);
		}
		System.out.println(sb);
		// How many objects of StringBuilder we created in above program?
		// 1
	}
}
