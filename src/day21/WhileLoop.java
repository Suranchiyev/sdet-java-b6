package day21;

public class WhileLoop {
	public static void main(String[] args) {
		// while condition is true it keeps repeating the body
		// when condition is false it exits the loop
		
		// while (condition) {
		//     body of the loop
		// }
		
		int count = 0; 
		//       100 < 100 -> false
		while (count < 100) {
			System.out.println(count + " Hello, world!");
			count++;
		}
		
	}
}
