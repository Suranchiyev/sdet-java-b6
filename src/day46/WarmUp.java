package day46;

public class WarmUp {
	public static void main(String[] args) {
		System.out.println(reverse("apple")); // elppa
		System.out.println(reverse("hello")); // olleh
		System.out.println(reverse("john")); // nhoj
	}
	
	/*
	 * Reverse argument str and return it
	 * reverse("apple") -> "elppa"
	 * reverse("hello") -> "olleh"
	 * reverse("john")  -> "nhoj"
	 */
	public static String reverse(String str) {
		StringBuilder res = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			res.append(str.charAt(i)); 
		}
		
		return res.toString();
	}
}
