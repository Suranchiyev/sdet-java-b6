package day30;

public class ArrayTaskTwo {
	public static void main(String[] args) {
		System.out.println(isTenThere(new int[] {1, 2, 5, 2, 1})); // false
		System.out.println(isTenThere(new int[] {1, 2, 5, 10, 2, 1})); // true
		System.out.println(isTenThere(new int[] {10, 2, 5, 2, 1})); // true
		System.out.println(isTenThere(new int[] {1, 2})); // false
		System.out.println("---------");
		
		System.out.println(countChars(new char[] {'a', 'a', 'b', 'c', 'a', 'b'}, 'a')); // 3
		System.out.println(countChars(new char[] {'a', 'a', 'b', 'c', 'a', 'b'}, 'b')); // 2
		System.out.println(countChars(new char[] {'a', 'a', 'b', 'c', 'a', 'b'}, 'c')); // 1
		System.out.println(countChars(new char[] {'a', 'a', 'b', 'c', 'a', 'b'}, 'x')); // 0
	}
	
	/*
	 * return number of ch in the chArr
	 * countChars(['a', 'a', 'b', 'c', 'a', 'b'], 'a') -> 3
	 * countChars(['a', 'a', 'b', 'c', 'a', 'b'], 'b') -> 2
	 * countChars(['a', 'a', 'b', 'c', 'a', 'b'], 'c') -> 1
	 * countChars(['a', 'a', 'b', 'c', 'a', 'b'], 'x') -> 0
	 * 
	 * Use for each loop
	 */
	public static int countChars(char[] chArr, char ch) {
		// 1. create a variable to count chars
		// 2. for each loop to iterate chArr array and count number of ch
		// 3. return count
		int count = 0;	
		
		for (char eachChar : chArr) {
			// we compare primitives with == operator
 			if (eachChar == ch) {
				count++;
			}
 			
		}
		
		return count;
	}
	
	/*
	 * return true if 10 is in the array; otherwise false
	 * isTenThere([1, 2, 5, 2, 1]) -> false
	 * isTenThere([1, 2, 5, 10, 2, 1]) -> true
	 * isTenThere([10, 2, 5, 2, 1]) -> true
	 * isTenThere([1, 2]) -> false
	 * 
	 * Use for each loop
	 */
	public static boolean isTenThere(int[] arr) {
		for (int number : arr) {
			if (number == 10) {
				return true;
			}
		}
		return false;
	}
}
