package day16;

public class StrSubstring {
	public static void main(String[] args) {
		//            012345678910
		String str = "Java is fun";
		
		// substring(start)
		// substring(start, end)
		// By using substring we can get a part of the string based on index/s
		
		System.out.println(str); // Java is fun
		// "fun" <- "Java is fun".substring(8);
		String strFun = str.substring(8);
		
		System.out.println(strFun); // fun
		System.out.println(str); // Java is fun
		
		//               0123456789
		String strOne = "SoftSkills are important";
		System.out.println(strOne); // 
		//  0123456789 ...                            
		// "SoftSkills are important"
		strOne = strOne.substring(4);
		System.out.println(strOne); // Skills are important
		
		// when substring is used with one argument we specify starting point and substring 
		// will return everything from that point to the right.
		//        0123456789..
		strOne = "my workspace";
		System.out.println(strOne); // my workspace
		
		strOne = strOne.substring(3);
		System.out.println(strOne); // workspace
		// 012345678
		// workspace
		
		strOne = strOne.substring(4);
		System.out.println(strOne); // space
		
		//               012345678910
		String strTwo = "Java is cool!";
		System.out.println(strTwo); // Java is cool!
		
		// substring(start, end)
		String strTwoIs = strTwo.substring(5, 7);
		System.out.println(strTwoIs); // is
		
		String strTwoJava = strTwo.substring(0, 4);
		System.out.println(strTwoJava); // Java
		
		// when substring is used with two arguments (start, end)
		// the start index includes the char under it and it will go till the end index(without including
		// index under end)
		
		//                 012345678
		String strThree = "workspace";
		System.out.println(strThree); // workspace
		
		strThree = strThree.substring(0, 4);
		System.out.println(strThree); // work
		
		//                0123456789..
		String strFour = "HelloClass!";
		System.out.println(strFour); // HelloClass!
		// second index is always one before
		strFour = strFour.substring(1, 5);
		System.out.println(strFour); // ello
		
		//                012345
		String strFive = "apple";
		System.out.println(strFive); // apple
		strFive = strFive.substring(2, 4);
		System.out.println(strFive); // pl
		
	}
}
