package day44;

public class B extends A {
	// TODO Override each method from class A
	// and give different implementation
	
	@Override
	public void printMsg(String msg) {
		System.out.println(msg.toLowerCase());
	}
	
	@Override
	public int getTotal(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		
		return sum * 2;
	}
	
	@Override
	public Employee getObj() {
		return new Employee();
	}
}
