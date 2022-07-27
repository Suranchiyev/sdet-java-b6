package day41;

import java.util.Map;
import java.util.HashMap;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(mostUsedWord("hello hello apple")); // hello
		System.out.println(mostUsedWord("hello hello apple apple apple")); // apple
	}
	
	/*
	 * maxAppearingWord("hello hello apple") -> hello
	 * maxAppearingWord("hello hello apple apple apple") -> apple
	 */
	public static String mostUsedWord(String content) {
		Map<String, Integer> map = new HashMap<>();
		String[] words = content.split(" ");
		for (String word : words) {
			if (map.containsKey(word)) {
				//      2
				int oldCount = map.get(word);
				map.put(word, oldCount + 1);
			} else {
				map.put(word, 1);
			}
		}
		
		int max = 0;
		String mostUsedWord = null;
		
		for (String key : map.keySet()) {
			if (max < map.get(key)) {
				max = map.get(key);
				mostUsedWord = key;
			}
		}
		
		return mostUsedWord;
	}
}



