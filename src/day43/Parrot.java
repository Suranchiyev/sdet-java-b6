package day43;

public class Parrot extends Bird {
	public void talk() {
		System.out.println(name + " parrot is talking");
	}
	
	// if we want to change implementation of the parent class method
	// we need to override it. We need to follow overriding rules to override correctly.
	// 1. The name should be the same
	// 2. The return type should be same or coherent type
	// 3. The access modifier should be the same or the child class method can be more visible.
	// 4. If parent class method declares exception, the child class cannot declare bigger exception
	@Override
	public void fly() {
		System.out.println(name + " parrot is flying");
	}
}
