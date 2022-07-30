package day45;

// Abstraction helps us to focus on 
// what object does instead of how it does.
public abstract class Car {
	public String color;
	public double speed;
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract double getSpeed();
	
	public void printDetails() {
		System.out.println("Car");
		System.out.println("color: " + color);
		System.out.println("speed: " + speed);
	}
}
