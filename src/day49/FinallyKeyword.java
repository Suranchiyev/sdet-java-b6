package day49;

public class FinallyKeyword {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toLowerCase());
			
			int i = 5;
			int i2 = 0;
			System.out.println(i / i2);
			
		} catch (ArithmeticException e) {
			System.out.println("In the catch statement");
			
		} finally {
			// finally runs all the time no matter what
			// usaully, it is used to close resources(file, data base connection)
			System.out.println("In the finally block");
		}
			
		System.out.println("After finally");
	}
}
