package day29;

public class SbReview {
	public static void main(String[] args) {
		// StringBuilder
		// What's the difference between String and StringBuilder?
		
		// 1. String is immutable and StrignBuilder is mutable
		// 2. If in my program I manipulate(change) the string value many times, I would better use 
		//    StringBuilder because each change with String will create new object. But with StringBuilder
		//    we can keep changing the same object.
		
		StringBuilder sb = new StringBuilder();
		sb.append("java");
		System.out.println(sb);
		
		sb.append(", ").append("python");
		System.out.println(sb);
		
		// most of the String methods are available for StrignBuilder
		// and StringBuilder has extra methods on its own.
		
		// 0123456789
		// java, python -> java, JS, python
		sb.insert(5, " JS,");
		System.out.println(sb);
		
		// 0123456789..
		// java, JS, python -> java, python
		sb.delete(6, 10);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		// String -> StringBuilder
		// new StirngBuilder(String) -> StringBuilder
		
		// StingBuilder -> String
		// sb.toString()
		
		System.out.println(reverse("apple"));
		System.out.println(reverse("orange"));
	}
	
	public static String reverse(String str) {
		// 1. get StringBuilder from String str
		StringBuilder sb = new StringBuilder(str);
		
		// 2. reverse using StringBuilder method
		sb.reverse();
		
		// 3. Convert from StringBuilder to String using toString() method
		return sb.toString();
	}
}
