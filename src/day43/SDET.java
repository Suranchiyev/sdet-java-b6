package day43;

public class SDET extends Employee {
	public String applicationName;
	public String laptopName;
	
	// 1. @Override will show when reading the code that overrided parent class method.
	// 2. It will check if overriding was correct or not.
	@Override
	public void work() {
		System.out.println("SDET is working...");
	}
	// Overriding rules:
	// 1. The name should of the method should be same.
	// 2. The arguments and return type(coherent) should be the same.
	// 3. Access modifiers should be the same, or child class method can be more visible.
	// 4. If parent method declares exception, the child method cannot declare bigger exception.
}
