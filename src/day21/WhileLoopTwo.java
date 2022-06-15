package day21;

public class WhileLoopTwo {
	public static void main(String[] args) {
		// TODO change this program to print number from 1 till 100 inclusive
		int number = 1;
		//          false
		//        101 <= 100 
		while (number <= 100) {
			System.out.print(number + " ");
			number++;
		}
		System.out.println();
		System.out.println("============");
		
		// TODO write code that will print numbers from 100 till 1 inclusive
		//      in one line.
		// 100 99 98 97 96 95 94 ... 1
		
		int numberTwo = 100;
		//            0 >= 1 -> false
		while (numberTwo >= 1) {
			System.out.print(numberTwo + " ");
			numberTwo--;
		}
		
	}
}
