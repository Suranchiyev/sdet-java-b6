package day8;

public class SpecAssignment {
	public static void main(String[] args) {
		int number = 100;
		// System.out.println(number + 10); // 110
		// increase by 10
		//     =  100 + 10
		number = number + 10;
		System.out.println(number); // 110
		System.out.println(number); // 110
		
		number += 10; // increase by 10
		System.out.println(number); // 120
		
		// number = number - 20;
		number -= 20;
		System.out.println(number); // 100
		
		//            100 * 3
		// number = number * 3;
		number *= 3;
		System.out.println(number); // 300
		
		// number = number / 2;
		number /= 2;
		System.out.println(number); // 150
	}
}
