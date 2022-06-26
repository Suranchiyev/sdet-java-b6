package day28;

public class StrBuilderTwo {
	public static void main(String[] args) {
		// StringBuilder is mutable object vs String is immutable
		// create new StringBuilder with empty value
		StringBuilder sb = new StringBuilder();
		
		// append(value) appends value to the right side of StringBuilder
		sb.append("hello");
		System.out.println(sb); // hello
		
		sb.append(", world!");
		System.out.println(sb); // hello, world!
		
		// create new StringBuilder with initial value
		StringBuilder tokyo = new StringBuilder("Tokyo");
		System.out.println(tokyo); // Tokyo
		
		// append new value to the right of SB
		tokyo.append(" - population is 37,400,068");
		System.out.println(tokyo); // Tokyo - population is 37,400,068
		
		// Why do we need to use StringBuilder when we have String?
		// Memory efficiency - for StringBuilder we can reuse same object, and 
		// for String we would need to create new object for every change.
		// Most of the time if we are changing our string inside the loop,
		// it is better to use StringBuilder.
		
		String strNumbers = "";
		for (int i = 1; i <= 100; i++) {
			strNumbers = strNumbers + i;
		}
		System.out.println(strNumbers);
		// In total 101 String objects are created
		
		StringBuilder sbNumbers = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sbNumbers.append(i);
		}
		System.out.println(sbNumbers);
		// In total 1 StringBuilder object is created
		
		// Do I always need to then use StringBuilder?
		// No, if string doesn't need to be changed a lot
		// it is better to just use String.
		
		StringBuilder sb2 = new StringBuilder("Apple");
		changeSb(sb2);
		System.out.println(sb2); // AppleOrange
		
		String str = "Apple";
		changeStr(str);
		System.out.println(str);
	}
	
	public static void changeSb(StringBuilder sb) {
		sb.append("Orange");
	}
	
	public static void changeStr(String str) {
		str += "Orange";
	}
	
}
