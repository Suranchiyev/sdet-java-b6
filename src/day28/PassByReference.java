package day28;

public class PassByReference {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Apple");
		changeSb(sb);
		System.out.println(sb); // AppleOrange
		System.out.println("------");
		
		String str = "Apple";
		changeStr(str);
		System.out.println(str); // Apple
	}
	
	public static void changeSb(StringBuilder sbInput) {
		// sbInput = sb;
		sbInput.append("Orange");
	}
	
	public static void changeStr(String strInput) {
		strInput = strInput + "Orange";
		// System.out.println(strInput);
	}
}
