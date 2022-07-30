package day45;

// the concrete classes must implement all abstract
// method of abstract class
// implement = override
public class Audi extends Car {
	@Override
	public void drive() {
		System.out.println("Audi is driving");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi is stop");
	}
	
	@Override
	public double getSpeed() {
		return speed;
	}
}
