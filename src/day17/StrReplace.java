package day17;

public class StrReplace {
	public static void main(String[] args) {
		// replace(oldStr, newStr)
		// It will replace the old string with new one and return new string
		
		String city = "Alma-Ata";
		System.out.println(city); // Alma-Ata
		
		//   = "Alma-Ata".replace("-", " ")
		city = city.replace("-", " ");
		System.out.println(city); // Alma Ata
		
		String str = "Updates=are=available=for=your=software";
		System.out.println(str); // Updates=are=available=for=your=software
		
		str = str.replace("=", "$");
		System.out.println(str);
		
		String msg = "hello, world!";
		//  = "hello, class!".replace("world", "class");
		msg = msg.replace("world", "class");
		System.out.println(msg); // hello, class!
		
		// TODO #1
		String strTwo = "I Am Software Development Engineer In Test";
		System.out.println(strTwo); // I Am Software Development Engineer In Test

		strTwo = strTwo.replace(" ", "");
		System.out.println(strTwo); // IAmSoftwareDevelopmentEngineerInTest
		
		
		// TODO #2
		String strThree = "Apple.Banana.Kiwi.Orange";
		System.out.println(strThree); // Apple.Banana.Kiwi.Orange
           
		strThree = strThree.replace(".", ", ").toLowerCase();
		// strThree = strThree.toLowerCase();
		
		System.out.println(strThree); // apple, banana, kiwi, orange
	}
}
