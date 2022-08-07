package day49;

public class ExceptionsPractice {
	public static void main(String[] args) {
		// Exceptions in Java
		// 1. Runtime exceptions
		//    - all sub-classes of RuntimeException class are runtime exceptions
		//    - it is not required to handle them, and we get to know about
		//      the exception while running
		
		// 2. Checked exceptions
		//    - all sub-classes of Exception class are checked exceptions
		//    - checked exceptions must be handled or delcared
		
		// 3. Error
		//    - we don't handle them
		//    - we don't throw them
		//    - they act like RuntimeExceptions
		
		// Handle exceptions
		try {
			
			String[] arr = new String[2];
			arr[0] = "apple";
			arr[1] = "kiwi";
			arr[2] = "orange";
			
			String str = null;
			System.out.println(str.toUpperCase());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is too small, provide bigger array");
			
		} catch (NullPointerException e) {
			System.out.println("Input was null, provide correct input");
		}
	}
}
