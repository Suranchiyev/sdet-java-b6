package homework;

public class StrReivew {
	public static void main(String[] args) {
		// System.out.println(getLastThreeChars("apple"));	
		System.out.println(getLastThreeChars("hi"));
		
		System.out.println(swapLastFirst("hello"));
		System.out.println(swapLastFirst("apple")); 
		System.out.println(swapLastFirst("john")); 
		System.out.println(swapLastFirst("hi")); 
		System.out.println(swapLastFirst("a")); 
		System.out.println("---------");
		
		System.out.println(isLowerCase("apple")); // true
		System.out.println(isLowerCase("Apple")); // false 
		System.out.println(isLowerCase("Hello")); // false
		System.out.println(isLowerCase("john")); // true
	}
	
	/*
	 * if str is in all lower cases return true
	 * otherwise false
	 * 
	 * isLowerCase("apple"); -> true
	 * isLowerCase("Apple"); -> false
	 * isLowerCase("Hello"); -> false
	 * isLowerCase("john"); -> true 
	 */
	public static boolean isLowerCase(String str) {
		String strTwo = str.toLowerCase();
		return str.equals(strTwo);
	}
	
	/*
	 * swapLastFirst("hello"); -> oellh
	 * swapLastFirst("apple"); -> eppla
	 * swapLastFirst("john"); -> nohj
	 * 
	 * charAt(index) -> return single character under this index
	 */
	public static String swapLastFirst(String str) {
		// break string into three parts
		// 1. get first part
		// 2. get last later
		// 3. get string in between(no first and last)
		if (str.length() < 2) {
			return str;
		}
		
		char firstLetter = str.charAt(0);
		char lastLetter = str.charAt(str.length() - 1);
		String middleStr = str.substring(1, str.length() - 1);
		return lastLetter + middleStr + firstLetter;
	}
	
	/*
	 * getLastThreeChars("apple"); // ple
	 * getLastThreeChars("john doe"); // doe
	 * length() - return number of chars
	 * substring() - return substring from the string
	 */
	public static String getLastThreeChars(String str) {
		if (str.length() <= 2) {
			return str;
		}
		
		return str.substring(str.length() - 3);
	}
}
