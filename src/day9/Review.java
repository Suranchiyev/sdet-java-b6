package day9;

public class Review {
	public static void main(String[] args) {
		// specialized assignment operators 
		int num = 10;
		//  =  10 + 5
		num = num + 5;
		System.out.println(num); // 15
		
		num += 5;
		System.out.println(num); // 20
		
		num -= 9;
		System.out.println(num); // 11
		
		num *= 3;
		System.out.println(num); // 33
		//                  33 + 5 => 38
		System.out.println(num + 5); // 38
		System.out.println(num); // 33
		System.out.println("----------");
		
		// increment and decrement operators
		int age = 30;
		System.out.println(age); // 30
		// age = age + 1;
		// age += 1;
		age++;
		System.out.println(age); // 31
		age++;
		System.out.println(age); // 32
		
		age--;
		System.out.println(age); // 31
		
		// post: age++; age--;
		age = 25;
		// the post increment/decrement will applied the next time when we use our variable.
		System.out.println(age++); // 25
		System.out.println(age); // 26
		
		// pre: ++age; --age;
		System.out.println(++age); 
	}
}









