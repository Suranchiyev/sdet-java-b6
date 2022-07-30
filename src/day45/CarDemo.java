package day45;

public class CarDemo {
	public static void main(String[] args) {
		// We cannot create object out of abstract
		// classes
		// Car obj = new Car();
		
		Car obj = new BMW();
		obj.drive();
		obj.drive();
		obj.drive();
		obj.stop();
		obj.drive();
		System.out.println(obj.getSpeed());
		// .. 100 lines of code	
	}
}
