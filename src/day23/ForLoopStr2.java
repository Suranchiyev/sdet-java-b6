package day23;

public class ForLoopStr2 {
	public static void main(String[] args) {		
		//            01234
		String str = "hello";
		System.out.println(str); // hello
		
		// TODO reverse the string
		// 1. Create new string to hold reverse version of str
		// 2. loop from the back of the string (i = str.length() - 1 -> i--)
		// 3. Keep adding chars from the back of the string to new string
		// 4. Reassign str to new string
		
		// it will keep reverse string value
		String revStr = "";
	
		// start from the back of the str 
		for (int i = str.length() - 1; i >= 0; i--) {   
			// keep getting each char one by one from the back
			// add keep adding them to revStr
			revStr = revStr + str.charAt(i);
		}
		str = revStr;
		System.out.println(str); // olleh
	}
}
