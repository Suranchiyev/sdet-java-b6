package day13;

public class ShapesFormula {
	// - the constants in java tagged by static final keywords
	// - we cannot reassign new value for constants.
	// - the name of constants usually goes all upper case.
	public static final double PI = 3.14;
	
	/*
	 * Circumference of a circle = 2 * PI * radius
	 */
	public static double getCircumference(int radius) {
		// PI = 5.0; // it will not compile because PI is constant(final)
		return 2 * PI * radius;
	}
	
	/*
	 * Area of circle = PI * radius ^ 2
	 */
	public static double getAreaOfCircle(int radius) {
		return PI * (radius * radius);
	}
	
	public static void main(String[] args) {
		double res = getCircumference(5);
		System.out.println("Circumference: " + res);
		
		res = getAreaOfCircle(5);
		System.out.println("Area: " + res);
	}
}
