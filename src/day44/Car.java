package day44;

public class Car extends Vehicle {
	// super - we refer to parent
	// this  - we refer to current class
	
	// super() - we are calling parent empty constructor
	// this()  - we are calling current class constructor
	
	public Car() {
		super("BMW", 25000.0);
		System.out.println("In Car class empty constructor");
	}
}
