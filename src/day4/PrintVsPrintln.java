package day4;

public class PrintVsPrintln {
	public static void main(String[] args) {
		// There are two type of print statements in java
		// 1. System.out.println();
		//    It will add new line after the output
		// 2. System.out.print();
		//    it will not add new line after the output
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("------");
		
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println("D");
		// ABCD
		System.out.print("E");
		// ABCD
		// E
		
	}
}
