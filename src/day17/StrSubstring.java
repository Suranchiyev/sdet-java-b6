package day17;

public class StrSubstring {
	public static void main(String[] args) {
		// indexOf(char value)
		// indexOf(String value)
		//            01234
		String str = "wooden spoon";
		System.out.println(str.indexOf('w'));
		System.out.println(str.indexOf("spoon"));
		
		char ch = str.charAt(3);
		System.out.println(ch);
	}
}
