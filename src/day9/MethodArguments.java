package day9;

public class MethodArguments {
	public static void main(String[] args) {
		sayHello("John"); // Hello, John!
		sayHello("Alex"); // Hello, Alex!
		sayHello("Bek"); // Hello, Bek!
		
		int sumValue = sum(8, 9);
		System.out.println(sumValue); // 17
		
		sumValue = sum(54, 32);
		System.out.println(sumValue); // 86
	}
	
	// (String name) is method argument
	// We provide input data to our methods via method arguments
	public static void sayHello(String name) {           
		System.out.println("Hello, " + name + "!");
	}
	
	// return type: int 
	// arguments: 2 int arguments
	public static int sum(int numOne, int numTwo) {           
		int result = numOne + numTwo;
		return result;
	}
}



