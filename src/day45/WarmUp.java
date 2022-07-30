package day45;

import java.util.Map;
import java.util.LinkedHashMap;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(countLetter("hello")); // h1e1l2o1
		System.out.println(countLetter("aaa"));   // a3
		System.out.println(countLetter("java"));  // j1a2v1
		System.out.println(countLetter("abc"));   // a1b1c1
	}
	
	/*
	 * countLetter("hello"); -> h1e1l2o1
	 * countLetter("aaa");   -> a3
	 * countLetter("java");  -> j1a2v1
	 * countLetter("abc");   -> a1b1c1
	 */
	public static String countLetter(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (char keyLetter : map.keySet()) {
			sb.append(keyLetter);
			sb.append(map.get(keyLetter));
		}
		
		return sb.toString();
	}
}
