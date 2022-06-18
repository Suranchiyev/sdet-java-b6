package homework;

public class StrReviewThree {
	public static void main(String[] args) {
		int x = 5;

		int y = x > 10 ? (isEven(x) ? x * 2 : x * 3) : (x * 5);
		System.out.println(y);
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
