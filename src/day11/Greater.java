package day11;

public class Greater {
	
	public static void main(String[] args) {
		System.out.println(greaterThan100(255.5)); // 255.5
		System.out.println(greaterThan100(33.9)); // 100.0
		

	}
	
	public static double greaterThan100(double dNum) {
		if (dNum > 100.0) {
			// return always exits the method.
			return dNum;
		} 
		
		return 100.0;
	}
}
