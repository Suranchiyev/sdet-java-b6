package day46;

public class CarDemo {
	public static void main(String[] args) {
		Car car = new BMW();
		// Car car - reference type
		// It will tell what properties and methods
		// are available
		car.drive();
		car.stop();
		
		// Runtime Polymorphism
		// if actual object(new BMW()) overrides 
		// some of the methods, the overriden method 
		// will be invoked
		Car car2 = new Audi();
	}
}
