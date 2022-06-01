package day13;

public class FinalVar {
	public static final double EURO_EXCHANGE_RATE = 1.07;
	
	public static void main(String[] args) {
		// final variables cannot be reassigned
		// EURO_EXCHANGE_RATE = 1.50;
		
		// we don't do capital case names for local variables
		final String name = "John Doe";
		final int age = 35;
		
		// name = "Alex"; 
		// age = 36;
		System.out.println(name);
		System.out.println(age);
		
		System.out.println(exchangeEuro(100));
	}
	
	public static double exchangeEuro(final int euro) {
		// euro = 1000; // doesn't compile, we cannot reassign final arguments
		return EURO_EXCHANGE_RATE * euro;
	}
}
