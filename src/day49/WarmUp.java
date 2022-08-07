package day49;

import java.util.HashMap;
import java.util.Map;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(createMap(new String[] {"apple", "kiwi", "orange"}));
		System.out.println(createMap(new String[] {"a", "aa", "aaa"}));
	}
	
	/*
	 * Create map(any) from argument arr where the key is value of array element
	 * and value is the length.
	 * createMap([apple, kiwi, orange]) -> {apple=5, kiwi=4, orange=6}
	 * createMap([a, aa, aaa])          -> {a=1, aa=2, aaa=3} 
	 */
	public static Map<String, Integer> createMap(String[] arr) {
		Map<String, Integer> map = new HashMap<>();
		
		for (String str : arr) {
			map.put(str, str.length());
		}
		
		return map;
	}
}
