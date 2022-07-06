package day31;

public class StrSplitTask {
	public static void main(String[] args) {
		System.out.println(countWord("This is great product. Great customer service", "great")); // 2
		System.out.println(countWord("Greatgreat", "great")); // 0
		System.out.println(countWord("oK ok OK", "OK")); // 3
		
	}
	
	/*
	 * This method should count number of word appearance in the content string
	 * (not case sensitive)
	 * 
	 * countWord("This is great product. Great customer service", "great") -> 2
	 * countWord("Greatgreat", "great") -> 0
	 * countWord("oK ok OK", "OK") -> 3
	 * 
	 * use .split() method
	 * 1. To get words I will split content by space
	 * 2. I will go over each word and compare with argument word
	 */
	public static int countWord(String content, String word) {
		int count = 0;
		String[] words = content.split(" ");
		for (String eachWord : words) {
//			if (eachWord.toLowerCase().equals(word.toLowerCase())) {
//				count++;
//			}
			if (eachWord.equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}
}
