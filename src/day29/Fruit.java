package day29;

public class Fruit {
	public static void main(String[] args) {
		// int[] score = new int[5];
		
		// numeric -> 0
		// object  -> null
		// boolean -> false
		
		//     0     1     2     3
		// [null, null, null, null]
		String[] fruit = new String[4];
		
		// initially each element of array has default value.
		System.out.println(fruit[0]); // null
		
		//       0     1     2     3
		// [orange, kiwi, banana, apple]
		fruit[0] = "orange";
		fruit[1] = "kiwi";
		fruit[2] = "banana";
		fruit[3] = "apple";
		
		String str = fruit[2];
		System.out.println(str); // banana
		
		System.out.println(fruit[2]);
		
		// [String 0, String 1, String 2, String 3]
		// We can treat each element as a variable
		
		//    0       1     2     3
		// [orange, kiwi, banana, apple] -> [orange, kiwi, cherries, apple]
		fruit[2] = "cherries";
	}
}
