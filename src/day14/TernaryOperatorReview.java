package day14;

import java.util.Random;

public class TernaryOperatorReview {
	public static void main(String[] args) {
		//         =      false -> secondValue
		//         =      true  -> firstValue
		//         = condition  ? firstValue : secondValue;
		//         = true  ? 
		String str = 5 > 3 ? "apple" : "banana";	
		System.out.println(str); // apple
		
		int res = false ? 100 : 1;
		System.out.println(res); // 1
		
		Random random = new Random();
		int num = random.nextInt(101);
		String isEven = num % 2 == 0 ? "Yes" : "No";
		System.out.println(num + " is even: " + isEven);  
	}
}
