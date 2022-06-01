package day13;

public class TernaryOperator {
	public static void main(String[] args) {
		int y = 10;
		int x;
		
		// if y > 5 then assign value for x as y * 2 otherwise assign value for x as y * 3

//		if (y > 5) {
//			x = y * 2;
//		} else {
//			x = y * 3;
//		}
		//            ?  true  : false
		//= condition ? value1 : value2
		
		x = y > 5 ? y * 2 : y * 3;
		System.out.println(y); // 10
		System.out.println(x); // 20
		
		String str;
		int num = 5;
		//           false ?
		str = num % 2 == 0 ? "Python" : "Java";
		System.out.println(str); // Java
		                                        // 5 -> "5"
		String msg = num > 10 ? "Big number" : String.valueOf(num);
		System.out.println(msg); // 5
	}
}
