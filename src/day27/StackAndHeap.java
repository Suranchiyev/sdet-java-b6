package day27;

public class StackAndHeap {
	public static void main(String[] args) {
		int res = 5;
		m();
		theEnd();
		Person obj = new Person();
	}
	
	public static void m() {
		int mySum = sum(2, 2);
		System.out.println("mySum: " + mySum);
	}
	
	public static int sum(int i, int i2) {
		return i + i2;
	}
	
	public static void theEnd() {
		System.out.println("The end");
		Person person = new Person();
	}
}
