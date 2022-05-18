package day5;

public class VarStrReview {
	public static void main(String[] args) {
		System.out.println("Hello, class!"); // println add new line after the output
		System.out.print("Tue java class"); // print will not add new line after the output
		System.out.println("Review");
		System.out.println("-----");
		
		// variables can hold data inside our program
		//    ["red"]
		String color = "red";
		
		System.out.println(color);
		
		color = "yellow";
		System.out.println(color);
		//                 "My favorite color is yellow"
		System.out.println("My favorite color is " + color);
		
		//            "this is yellow car"
		String msg = "this is " + color + " car";
		System.out.println(msg); // this is yellow car
		System.out.println(msg); // this is yellow car
		
		msg = "java!";
		System.out.println(msg);
	}
}
