package day28;

public class SbMethods {
	public static void main(String[] args) {
		// charAt(), indexOf(), length(), substring()
		// these methods work exactly the same as in the String class
		
		//                                     012345
		StringBuilder day = new StringBuilder("Sunday");
		char ch = day.charAt(2);
		System.out.println(ch); // n
		
		int index = day.indexOf("d");
		System.out.println(index); // 3
		
		int sizeOfSb = day.length();
		System.out.println("Length: " + sizeOfSb);
		
		// substring() returns String 
		String subStr = day.substring(0, 3);
		System.out.println(subStr); // Sun
		
		// insert(index, value)
		//                                    012345678910...
		StringBuilder sb = new StringBuilder("John programmer");
		sb.insert(4, " is");
		System.out.println(sb);
		
		//                                     0123
		StringBuilder sb2 = new StringBuilder("java");
		sb2.insert(2, "-");
		System.out.println(sb2); // ja-va
		
		// delete(start, end)
		//                                     012345
		StringBuilder sb3 = new StringBuilder("abcdef");
		sb3.delete(1, 3);
		System.out.println(sb3); // adef
		
		//                                     012345678910..
		StringBuilder sb4 = new StringBuilder("john is programmer");
		sb4.delete(4, 7);
		System.out.println(sb4); // john programmer
		
		StringBuilder sb5 = new StringBuilder("hello");
		sb5.deleteCharAt(0);
		System.out.println(sb5); // ello
		
		StringBuilder sb6 = new StringBuilder("wooden spoon");
		System.out.println(sb6);
		sb6.reverse();
		System.out.println(sb6);
	}
}
