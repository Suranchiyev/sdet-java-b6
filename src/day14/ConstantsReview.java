package day14;

public class ConstantsReview {
	// constants in java tagged as static final.
	// you cannot change value of constants.
	public static final String KEY = "my secret key";
	
	public static void main(String[] args) {
		// We cannot change value of final variables.
		final String color = "white";
		// color = "yellow";
		printVar("Hello, class!");
		
		// KEY = "new secret key";
		System.out.println(KEY);
		System.out.println(ConstantsReview.KEY);
	}
	
	public static void printVar(final String str) {
		// str = "abc";
		System.out.println("value: " + str);
	}
}
