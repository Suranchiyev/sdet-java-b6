package day38;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetTask {
	public static void main(String[] args) {
		System.out.println(removeDuplicates("hello")); // helo
		System.out.println(removeDuplicates("aaaa")); // a
		System.out.println(removeDuplicates("apple")); // aple
		System.out.println(removeDuplicates("aaabbba")); // ab
		
		System.out.println("--------");
		System.out.println(removeDuplicates2("hello")); // helo
		System.out.println(removeDuplicates2("aaaa")); // a
		System.out.println(removeDuplicates2("apple")); // aple
		System.out.println(removeDuplicates2("aaabbba")); // ab
	}
	
	/*
	 * Remove duplicates from String str by using set
	 * removeDuplicates("hello") -> "helo"
	 * removeDuplicates("aaaa") -> "a"
	 * removeDuplicates("apple") -> "aple"
	 * removeDuplicates("aaabbba") -> "ab"
	 */
	public static String removeDuplicates(String str) {
		// TODO
		// 0. Create Set of Character
		// 1. Put each char of String str to set
		// 2. Put back to the res "string" and return it 
		
		// create set. We use LinkedHashSet to keep the order
		Set<Character> set = new LinkedHashSet<>();
		
		// put each char from str to set to remove duplicates
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		// get back all chars from set to string and return it
		StringBuilder sbRes = new StringBuilder();
		for (char chEach : set) {
			sbRes.append(chEach);
		}
		return sbRes.toString();
	}
	
	public static String removeDuplicates2(String str) {
		Set<Character> set = new HashSet<>();
		StringBuilder res = new StringBuilder();
		
		for (char ch : str.toCharArray()) {
			if (!set.contains(ch)) {
				res.append(ch);
				set.add(ch);
			}
		}
		return res.toString();
	}
}
