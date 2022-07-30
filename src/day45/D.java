package day45;

// first non abstract class
// that implements(inherits) our abstract class
public class D extends C {
	@Override
	public void code() {
		System.out.println("Coding..");
	}
	
	@Override
	public void read() {
		System.out.println("Sleeping...");
	}
	
	@Override
	public int sleepHours() {
		return 8;
	}
}
