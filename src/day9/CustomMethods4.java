package day9;

public class CustomMethods4 {
	public static void main(String[] args) {
		double returnedValue = plus100(5.5);
		System.out.println(returnedValue);
		
		returnedValue = plus100(55.77);
		System.out.println(returnedValue);
	}
	
	public static double plus100(double dNum) {
		double res = dNum + 100;
		return res;
	}
}
