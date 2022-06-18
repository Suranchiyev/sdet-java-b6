package day23;

public class ForLoopPractice2 {
	
	public static void main(String[] args) {
		System.out.println(getCount2("apple", 'p')); // 2
		System.out.println(getCount2("hello", 'o')); // 1
		System.out.println(getCount2("hello world", 'o')); // 2
		System.out.println(getCount2("aaaa", 'a')); // 4
		System.out.println(getCount2("john", 'x')); // 0
	}
	
	public static int getCount2(String str, char ch) {
		int count = 0;
		int startFrom = -1;
		
		while ((startFrom = str.indexOf(ch, startFrom + 1)) >= 0) {
			count++;
		}
		
		return count;
	}
	
	/*
	 * method should return the number of char ch in the str
	 * getCount("apple", 'p');       -> 2
	 * getCount("hello", 'o');       -> 1
	 * getCount("hello world", 'o'); -> 2
	 * getCount("aaaa", 'a');		 -> 4
	 * getCount("john", 'x'); 		 -> 0
	 * 
	 * 0. Declare count variable that will hold number of ch in the str
	 * 1. Loop over the String str 
	 * 2. Get each char using charAt(i)
	 * 3. Compare if that char is equal to ch if yes increase count
	 * 4. After the loop return count
	 */
	public static int getCount(String str, char ch) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char eachChar = str.charAt(i);

			if (eachChar == ch) {				
				count++;
			}
		}
		
		return count;
	}
}






