package day6;

public class RemainderOperator {
	public static void main(String[] args) {
		// % - remainder 
		int num = 11;
		int num1 = 3;
		//             
		//                  11 / 3 = 3 and 2 remains
		System.out.println("division: " + (num / num1)); // 3
		System.out.println("remainder: " + (num % num1)); // 2
		
		// 12 / 10 = 1 and 2 remains
		// 12 % 10 = 2
		
		// 23 / 10 = 2 and 3 remains
		// 23 % 10 = 3
		
		// 5 + 5 + 5 + 2 = 17
		// 17 / 5 = 3 and 2 remains
		// 17 % 5 = 2
		
		// 117 / 10 = 11 and 7 remains
		// 117 % 10 = 7
		
		// 234 / 100 = 34
		// 234 % 100 = 34
		
		// 13 / 5 = 2 and 3 remains
		// 13 % 5 = 3
		
		// 18 / 6 = 3 and 0 remains
		// 18 % 6 = 0
		
		// 38 / 5 = 7 and 3 remains
		// 38 % 5 = 3
		
		System.out.println(45 % 5); // 0
		System.out.println(47 % 5); // 2
		System.out.println(47 % 20); // 7
		System.out.println(1001 % 1000); // 1
		System.out.println(12 % 9); // 3
		System.out.println(117 % 10); // 7
		System.out.println(17 % 10); // 7
		System.out.println(134 % 100); // 34
		System.out.println(26 % 5); // 1
		System.out.println("------");
		// if the first value of remainder is smaller the second one
		// the first value will be returned
		System.out.println(5 % 25); // 5
		System.out.println(1 % 100); // 1
	}
}
