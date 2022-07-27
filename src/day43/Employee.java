package day43;

public class Employee {
	public long employeeId;
	public double salary;
	public String department;
	
	public void work() {
		System.out.println("Employee is working...");
	}
	
	// - the final variable cannot be changed(we cannot reassign)
	// - the final class cannot be extended
	// - the final method cannot be overridden
}
