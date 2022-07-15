package day34;

public class Varargs {
	public static void main(String[] args) {
		int res = sum(5, 6);
		System.out.println("Sum 1: " + res);
		
		res = sum(3, 4, 7);
		System.out.println("Sum 2: " + res);
		
		res = sum(new int[] {3, 5, 6, 8, 9});
		System.out.println("Sum 3: " + res);
		
		res = sum(2);
		System.out.println("Sum 4: " + res);
	}
	
	// 1. Varargs can be used only inside the method argument
	// 2. We use vararg inside our method as regular array
	// 3. In the client for vararg argument we can pass list of arguments or array
	public static int sum(int... numArr) {
		int sum = 0;
		for (int num : numArr) {
			sum += num;
		}
		return sum;
	}
}
