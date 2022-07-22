package day40;

import java.util.Map;
import java.util.HashMap;

public class MapInterviewTask {
	public static void main(String[] args) {
		System.out.println(getMostAppearingLetter("hello")); // l
		System.out.println(getMostAppearingLetter("abbcccee")); // c
		System.out.println(getMostAppearingLetter("aaaabbbb")); // a or b
		System.out.println(getMostAppearingLetter("abcdeabcded")); // d
	}
	
	/*
	 * Return the most appearing letter in the String str. If multiple letter appearing the same
	 * number of times, return any of them
	 * getMostAppearingLetter("hello"); -> 'l'
	 * getMostAppearingLetter("abbcccee"); -> 'c'
	 * getMostAppearingLetter("aaaabbbb"); -> 'a' or 'b'
	 * getMostAppearingLetter("abcdeabcded"); -> 'd'
	 */
	public static char getMostAppearingLetter(String str) {
		// 1. Create a map and count each letter appearance(refer to MapInterview.java).
		Map<Character, Integer> map = new HashMap<>();
		for (char letter : str.toCharArray()) {
			if (map.containsKey(letter)) {
				int oldCount = map.get(letter);
				map.put(letter, oldCount + 1);
			} else {
				map.put(letter, 1);
			}
		}
		// 2. Get the key of the biggest value.
		int max = 0;
		char maxKey = 0;
		for (char key : map.keySet()) {
			char letter = key;
			int count = map.get(key);

			if (max < count) {
				max = count;
				// every time when we update max value, we need update maxKey as well
				maxKey = letter;
			}
		}
		
		return maxKey;
	}
}
