package day44;

public class A {
	public void printMsg(String msg) {
		System.out.println(msg.toUpperCase());
	}
	
	public int getTotal(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	// Covariant return type
	public Person getObj() {
		return new Person();
	}
	
}
