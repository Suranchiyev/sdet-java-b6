package day15;

public class StrUpperLowerCase {
	public static void main(String[] args) {
		// toUpperCase() converts value of String to all upper cases and returns it as new string.
		// toLowerCase() converts value of String to all lower cases and returns it as new string.
		
		String str = "java";
		System.out.println("str: " + str);

		str = str.toUpperCase();
		System.out.println("str: " + str);
		
		String str2 = "apple";
		System.out.println("str2: " + str2); // str2: apple
		
		// String is immutable. The initial value doesn't get change unless we reassign
		// it return new string with all upper cases, but it will not change original value
		str2.toUpperCase();
		System.out.println("str2: " + str2); // str2: apple
		
		String str3 = "Python";
		System.out.println("str3: " + str3); // str3: Python
		System.out.println("str3: " + str3.toLowerCase()); // str3: python
		System.out.println("str3: " + str3); // str3: Python
		
		str3 = str3.toLowerCase();
		System.out.println(str3);
	}
}
