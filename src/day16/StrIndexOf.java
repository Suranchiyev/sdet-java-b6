package day16;

public class StrIndexOf {
	public static void main(String[] args) {
		/*
		 * indexOf(String)
		 * indexOf(char)
		 * it will get index of provided char or string
		 */
		
		//            01234
		String str = "apple";
		int index = str.indexOf("e");
		System.out.println(index); // 4
		
		index = str.indexOf("l");
		System.out.println(index); // 3
		
		// when there are more than one result, indexOf() will return first one
		System.out.println(str.indexOf("p")); // 1
		System.out.println("-------");
		
		//               012345678
		String strTwo = "xyzzxxyz";
		System.out.println(strTwo.indexOf("z"));
		
		//      2
		int firstIndexZ = strTwo.indexOf("z"); 
		
		// indexOf(value, fromIndex);
		int secondIndexZ = strTwo.indexOf("z", firstIndexZ + 1);
		System.out.println(secondIndexZ);
		
		int thirdIndexZ = strTwo.indexOf("z", secondIndexZ + 1);
		System.out.println(thirdIndexZ);
		
		//                 0123456789
		String strThree = "xyzabcaxyz";
		int lastIndexOf = strThree.lastIndexOf("a");
		System.out.println(lastIndexOf); // 6
		//                                       a,  7
		int lastIndexOf2 = strThree.lastIndexOf("a", lastIndexOf - 1);
		System.out.println(lastIndexOf2);
		
		
		// length() -> int
		// substring(int) -> String
		// substring(int, int) -> String
	}
}











