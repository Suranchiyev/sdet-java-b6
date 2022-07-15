package day35;

public class ReviewVarargs {
	public static void main(String[] args) {
		System.out.println(multiply(2, 2));
		System.out.println(multiply(2, 2, 3));
		System.out.println(multiply(2, 2, 3, 4));
		
		int[] inputArr = {1, 2, 3, 4, 5};
		System.out.println(multiply(inputArr));
		
		System.out.println("-------");
		
		print("Hello");
		System.out.println("-------");
		
		print("Apple", "Kiwi", "Orange");
		System.out.println("-------");
		
		String[] strArr = {"John", "Alex", "Kuba", "Bek"};
		print(strArr);
	}
	
	// 1. Only one vararg per method argument
	// 2. We can use varargs with other arguments, but it should last argument of the method
	public static int multiply(int...  numbers) {	
		// inside the method we use varargs as regular array
		int sum = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			sum *= numbers[i];
		}
		
		return sum;
	}
	
	public static void print(String... strings) {
		for (String str : strings) {
			System.out.println(str);
		}
	}
}
