package day22;

public class ForLoop {
	// while loops
	// 	- when you don't how many iterations you need, while loop is good.
	// for loops
	//  - when you know in advance how many iterations you need.
	
	public static void main(String[] args) {
		// for (init part; condition; update) {
		// 		body of loop
		// }
		
		// while condition part is true, the body keeps executing
		// the first iteration update statement doesn't run
		
		//       i = 0; 1 < 10; 
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " Hello, world!");
		}
		System.out.println("========");
		// 1 2 3 4 ... 100
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("========");
		
		// TODO
		// print numbers from 100 till 1 inclusive
		// 100 99 98 97 96 ... 1
		
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("========");
	}
}
