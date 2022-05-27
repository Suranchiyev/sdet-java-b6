package day9;

public class SayHello {
	public static void main(String[] args) {
		printHello("Bek");
		printHello("Alex");
		
		int result = sum(12, 5);
		System.out.println(result);
		
		result = sum(7, 9);
		System.out.println(result);
	}
	
	public static void printHello(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	
	public static int sum(int i, int i2) {
		return i + i2;
	}

}
