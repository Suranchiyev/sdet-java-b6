package day18;

public class StrMethods {
	public static void main(String[] args) {
		// trim()
		// it removes white spaces around the string value
		String str = "  wooden spoon   ";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		
		String itemPrice = " 5.99  ";
		itemPrice = itemPrice.trim();
		//                    parseDouble has auto trim
		double price = Double.parseDouble(itemPrice);
		if (price < 6.00) {
			System.out.println("Pass");
		}
		System.out.println("---------------");
		
		// isEmpty()
		// it checks if string is empty or not
		// string.length() == 0 -> string is empty
		
		String name = "";
		if (name.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
		
		
		// String.join(delimiter, values...)
		String box = "apple, banana, kiwi, orange";
		System.out.println(box); // apple, banana, kiwi, orange
		
		String boxTwo = String.join("&", "apple", "banana", "kiwi", "orange");
		System.out.println(boxTwo); // apple&banana&kiwi&orange
		
		String boxThree = String.join(" is ", "Java", "Great", "!");
		System.out.println(boxThree); // Java is Great is !
		
		// String.valueOf(argument)
		// It return string representation of argument
		
		int i = 99;
		//     "99"
		String strI = String.valueOf(i);
		System.out.println(strI); // 99
		
		// string concatenation always returns string
		String strI2 = "" + i;
		System.out.println(strI2);
	}
}
