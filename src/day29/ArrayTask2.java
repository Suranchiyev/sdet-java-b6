package day29;

public class ArrayTask2 {
	public static void main(String[] args) {
		int[] inputArr = {1, 2, 3, 4};
		int res = getSumOfFirstAndLast(inputArr);
		System.out.println(res); // 5
		
		inputArr = new int[]{3, 3, 1, 5, 6};
		res = getSumOfFirstAndLast(inputArr);
		System.out.println(res); // 9
		
		inputArr = new int[]{3, 3};
		res = getSumOfFirstAndLast(inputArr);
		System.out.println(res); // 6
		
		System.out.println("-----");
		boolean isEven = isEvenLength(new char[] {'a', 'b'});
		System.out.println(isEven); // true
		
		isEven = isEvenLength(new char[] {'a', 'b', 'c'});
		System.out.println(isEven); // false
		
		isEven = isEvenLength(new char[] {'a', 'b', 'c', 'd'});
		System.out.println(isEven); // true
	}
	
	/*
	 * getSumOfFirstAndLast([1, 2, 3, 4])    -> 5
	 * getSumOfFirstAndLast([3, 3, 1, 5, 6]) -> 9
	 * getSumOfFirstAndLast([3, 3])          -> 6
	 */
	public static int getSumOfFirstAndLast(int[] arr) {
		int firstElement = arr[0];
		int lastElement = arr[arr.length - 1];
		return firstElement + lastElement;
	}
	
	/*
	 * if size of array is even return true; otherwise false
	 * 
	 * isEvenLength(['a', 'b']) 	      -> true
	 * isEvenLength(['a', 'b', 'c'])      -> false
	 * isEvenLength(['a', 'b', 'c', 'd']) -> true
	 */
	public static boolean isEvenLength(char[] chArr) {
		return chArr.length % 2 == 0;
	}
}
