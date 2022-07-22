package day40;

import java.util.Map;
import java.util.LinkedHashMap;

public class MapInterview {
	public static void main(String[] args) {
		System.out.println(countLetters("hellohhhh")); // h5e1l2o1
		System.out.println(countLetters("hello")); // h1e1l2o1
		System.out.println(countLetters("aaaabb")); // a4b2
		System.out.println(countLetters("aabbccaa")); // a4b2c2
		System.out.println(countLetters("abc")); // a1b1c1
	}
	
	/*
	 * countLetters("hello");    -> "h1e1l2o1"
	 * countLetters("aaaabb");   -> "a4b2"
	 * countLetters("aabbccaa"); -> "a4b2c2"
	 * countLetters("abc");      -> "a1b1c1"
	 */
	public static String countLetters(String str) {
		// Map of K=letter, V=Count
		// Loop over String str
		// From Map convert to string with correct return style
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char letter : str.toCharArray()) {
			if (map.containsKey(letter)) {
				int oldCount = map.get(letter);
				map.put(letter, oldCount + 1);
			} else {
				map.put(letter, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (char key : map.keySet()) {
			sb.append(key).append(map.get(key));
		}
		return sb.toString();
	}
}






