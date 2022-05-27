package day10;

public class MethodsReview {
	public static void main(String[] args) {
		// void method doesn't return a value
		// return type methods must return value
		// method arguments are used to pass input data to out methods
		String progLan = "Java";
		print3Times(progLan);
		
		print3Times("Python");
		// Why we create a method?
		// reusablity
		print3Times("JavaScript");
		
		String strRes = join("A", "B", "C");
		System.out.println(strRes); // A B C
		
		double dRes = myOwnSum(5.5, 4.5, 2);
		System.out.println(dRes); // 20
		
		dRes = myOwnSum(1.5, 1.5, 3);
		System.out.println(dRes); // 9
		
		double firstInput = 9.1;
		double secondInput = 0.9;
		int thirdArgument = 5;
		
		dRes = myOwnSum(firstInput, secondInput, thirdArgument);
		System.out.println(dRes);
	}
	
	// What we can tell about this method?
	// return type: double
	// arguments: 3 arguments, 2 double and 1 int
	// what does it do: add two double args and then multiply by third int argument 
	public static double myOwnSum(double d, double d1, int num) {
		double result = (d + d1) * num;
		return result;
	}
	
	
	// What we can tell about this method?
	// return type: String
	// arguments: 3 arguments of type String
	// what it does: returns 3 arguments joined together by space
	//                              "A"       "B"        "C"
	public static String join(String s, String s1, String s2) {
		//           A B C
		String res = s + " " + s1 + " " + s2;
		// "A B C"
		return res;
	}
	
	// What we can tell about this method?
	// return type: void(no return)
	// arguments: 1 argument of type String
	// what it does: prints 3 times its String argument
	//                                  "Python"
	public static void print3Times(String str) {
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
	}
	
	
}
