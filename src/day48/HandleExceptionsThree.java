package day48;

public class HandleExceptionsThree {
	public static void main(String[] args) {
		// Runtime Exceptions 
		// - it is not required to handle them
		// - all subclasses of RuntimeException are runtime exceptions
		
		// Checked Exceptions
		// - it must be handled or declared
		// - all subclasses of Exception are checked exceptions
		// ----------------------
		
		// Exception declaration
		try {
			printHello(5);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		sayHello();
	}
	
	public static void printHello(int i) throws Exception {
		System.out.println("Hello");
		
		if (i % 2 == 0) {
			throw new Exception();
		}
	}
	
	public static void sayHello() throws RuntimeException {
		System.out.println("hello");
	}
}
