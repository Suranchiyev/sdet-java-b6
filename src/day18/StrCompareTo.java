package day18;

public class StrCompareTo {
	public static void main(String[] args) {
		/*
		 * "this".compareTo(String argument)
		 * - the result is negative value if this string lexicographically(alphabetically) 
		 *   precedes the argument string. 
		 * - the result is positive value if this string lexicographically(alphabetically)
		 *   follows the argument string.
		 * - the result is zero if the strings are equal
		 */
		
		String name = "Alex";
		String nameTwo = "Alex";
		
		// how do I check if name is preceding in alphabetical order nameTwo?
		int result = name.compareTo(nameTwo);
		System.out.println(result); // -9
		
		if (result < 0) {
			System.out.println(name + " should be first in alphabetical order compare to " + nameTwo);
		} else {
			System.out.println(name + " should not be first in alphabetical order compare to " + nameTwo);
		}
	}
}
