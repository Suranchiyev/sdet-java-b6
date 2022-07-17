package day37;

import java.util.Set;
import java.util.HashSet;

public class SetTaskTwo {
	public static void main(String[] args) {
		System.out.println(removeDuplicates("apple")); // aple
		System.out.println(removeDuplicates("eee"));   // e
		System.out.println(removeDuplicates("helloho")); // helo
	}
	
	/*
	 * removeDuplicates("apple")   -> "aple"
 	 * removeDuplicates("eee")     -> "e"
	 * removeDuplicates("helloho") -> "helo"
	 */
	public static String removeDuplicates(String str) {
		// we need this to keep no duplicate res
		StringBuilder sbNoDup = new StringBuilder();
		Set<Character> set = new HashSet<>();
		
		for (char ch : str.toCharArray()) {
			if (!set.contains(ch)) {
				sbNoDup.append(ch);
				set.add(ch);
			}
		}
		return sbNoDup.toString();
	}
}
