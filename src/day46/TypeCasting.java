package day46;

public class TypeCasting {
	public static void main(String[] args) {
		// inheritance (parent <- child)
		// abstract class (abstract class <- conrecte class)
		// interface (interface <- conrecte class)
		
		Car car = new BMW();
		
		// type casting
		BMW bmw = (BMW)car;
		bmw.driveFast();
		
		Car car2 = new BMW();
		// Audi audi = (Audi)car2; // ClassCastException
		
		Audi audi2 = new Audi();
		// BMW bmw2 = (BMW)audi2;
		Car car3 = audi2;
	}
}
