package day22;

import java.util.Random;

public class DoWhile2 {
	public static final int MY_NUMBER = 5;
	
	public static void main(String[] args) {
		Random random = new Random();
		int randomNumber;
		
		do {
			//                         0 - 10
			randomNumber = random.nextInt(11);
			System.out.println(randomNumber);
			//              5 != 5 -> false
		} while (randomNumber != MY_NUMBER);
	}
}
