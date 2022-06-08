package day17;

public class StrIndexOfReview {
	public static void main(String[] args) {
		// indexOf("Abc")
		// indexOf('a')
		//            0123456789
		String str = "Java is great programming language";
		int index = str.indexOf('v');
		System.out.println(index);
		
		// we can search for multiple chars(string)
		// it will return starting index of that value
		System.out.println(str.indexOf("great")); // 8
		
		// if no such value exist, then -1 is returned.
		System.out.println(str.indexOf('A')); // -1
		System.out.println(str.indexOf("Great")); // -1
		System.out.println(str.indexOf("abc")); // -1
		System.out.println("-----------");
		                     
		String content = "hello hello the item price is {$20} abc xyz 123  asdf  the end";
		int indexStart = content.indexOf("{");
		int indexEnd = content.indexOf("}");

		String priceResult = content.substring(indexStart + 1, indexEnd);
		System.out.println(priceResult);
	}
}
