package day9;

public class CustomMethods3 {
	public static void main(String[] args) {
		printExclamation("Apple");
		
		printExclamation("Banana");
	}
	
	// method arguments is the way we pass data to our method
	// input -> process -> output
	public static void printExclamation(String msg) {
		System.out.println(msg + "!");
	}
	
	
}
