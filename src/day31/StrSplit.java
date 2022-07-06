package day31;

import java.util.Arrays;

public class StrSplit {
	public static void main(String[] args) {
		String str = "Java 101 for SDET 2022 at TLA";
		// How many words are in my string?
		// Print each word from the string?
		
		String[] words = str.split(" ");
		System.out.println("Number of words: " + words.length);
		
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("----------");
		
		String strTwo = "apple, orange, kiwi";
		String[] partsOne = strTwo.split(",");
		System.out.println(Arrays.toString(partsOne)); // ["apple", " orange", " kiwi"]
		
		// apple, orange, kiwi
		String[] partsTwo = strTwo.split("orange, ");
		System.out.println(Arrays.toString(partsTwo)); // [apple, , kiwi]
		
		System.out.println("---------");
		for (String part : partsTwo) {
			System.out.println(part);
		}
	}
}
