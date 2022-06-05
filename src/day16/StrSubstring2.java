package day16;

public class StrSubstring2 {
	public static void main(String[] args) {
		//             0123456789
		String name = "John Doe";
		System.out.println(name); // John Doe
		System.out.println(name.substring(0, 4)); // John
		System.out.println(name); // John Doe
		System.out.println("-----------");
		
		//             0123456789...
		String str  = "python is good";
		String str1 = "workspace";
		String str2 = "HelloWorld";
		String str3 = "SDLC";
		String str4 = "Sublime";
		String str5 = "Window";
		String str6 = "OptimizePDF";
		String str7 = "Navigate";
		String str8 = "Search";
		
		System.out.println(str.substring(0, 6));  // python
		System.out.println(str1.substring(4, 7)); // spa
		System.out.println(str2.substring(3, 6)); // loW
		System.out.println(str3.substring(1, 3)); // DL
		System.out.println(str4.substring(2, 4)); // bl
		System.out.println(str5.substring(1, 4)); // ind
		System.out.println(str6.substring(8)); // PDF
		System.out.println(str7.substring(0, 3)); // Nav
		System.out.println(str8.substring(1, 4)); // ear
		
		System.out.println(str); // python is good
	}
}









