package day34;

public class VarargsTwo {
	public static void main(String[] args) {
		String str = join("abc", "bca");
		System.out.println(str);
		
		str = join("wooden", "spoon", "here");
		System.out.println(str);
		
		str = join("hello", "!", "John", "Doe");
		System.out.println(str);
		
		str = join(new String[] {"A", "B", "C"});
		System.out.println(str);
	}
	
	public static String join(String... strs) {
		StringBuilder sb = new StringBuilder();
		
		for (String str : strs) {
			sb.append(str);
		}
		
		return sb.toString();
	}
	
	// 1. Only one varargs per method
//	public static void myMethod(String... strs, int... nums) {
//		
//	}
	
	// 2. Vararg argument should be the last argument
	public static void myMethod(double dNum, String str, int... nums) {
		
	}
}
