package day48;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String str = "123a";
		int num = Integer.parseInt(str); // java.lang.NumberFormatException
		System.out.println(num);
	}
}
