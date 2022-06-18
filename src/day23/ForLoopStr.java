package day23;

public class ForLoopStr {
	public static void main(String[] args) {
		//            01234
		String str = "Apple";

		// i as out index to loop over the string
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("------");
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}
