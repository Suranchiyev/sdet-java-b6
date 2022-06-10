package day18;

public class Review {
	// main
	// Ctrl + Space -> choose first option
	public static void main(String[] args) {
		// sysout 
		// Ctrl + Space
		System.out.println("How to compare two strings on equality?");
		
		String str = "orange";
		String strTwo = "apple";
		
		if (str.equals(strTwo)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		
		if (str.equalsIgnoreCase(strTwo)) {
			System.out.println("Equal(cases ignored)");
		} else {
			System.out.println("Not equal(cases ignored)");
		}
	}
}
