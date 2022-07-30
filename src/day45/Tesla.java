package day45;

public class Tesla extends Car {
	// TODO 
	// 1. Make Tesla class a concrete class of Car
	// 2. Implement all Car's abstract methods
	//    implement = override
	
	@Override
	public void drive() {
		System.out.println("Tesla is driving");
	}
	
	@Override
	public void stop() {
		System.out.println("Tesla is stopped");
	}
	
	@Override
	public double getSpeed() {
		return 100.5;
	}
}
