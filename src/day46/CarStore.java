package day46;

public class CarStore {
	public static void main(String[] args) {
		BMW bmw = new BMW();
		sellCar(bmw);
		
		Audi audi = new Audi();
		sellCar(audi);
		
		System.out.println("-----");
		
		String str = "apple";
		myMethod(str);
		System.out.println("-----");
		
		Integer num = 25;
		myMethod(num);
		
		System.out.println("-----");
		myMethod(bmw);
		
		System.out.println("-----");
		myMethod(audi);
	}
	
	public static void sellCar(Car car) {
		if (car instanceof BMW) {
			System.out.println("Sell for sure!");
		} else if (car instanceof Audi) {
			System.out.println("I like my audi, what's your price?");
		} else {
			System.out.println("Selling my car");
		}
	}
	
	// I want create method that can accpet all types(not primitive)
	public static void myMethod(Object obj) {
		// object instanceof DataType
		if (obj instanceof String) {
			System.out.println("this is Sring object");
		} else if (obj instanceof Integer) {
			System.out.println("this is Integer object");
		} else if (obj instanceof BMW) {
			System.out.println("this is BMW object");
		} else {
			System.out.println("this is unknown object");
		}
	}
	
}
