package day8;

public class MethodExample {
	public static void main(String[] args) {
		printHelloClass();
		// some code here
		System.out.println("----");
		printHelloClass();
	}
	
	// The method is block of code that has a name 
	// and in order to use it, we need to call it by its name.
	// void means method doesn't return a value
	public static void printHelloClass() {
		System.out.println("hello, class!");
		System.out.println("hello, class!");
		System.out.println("hello, class!");
	}
}
