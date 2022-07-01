package day30;

public class ArrayReview {
	public static void main(String[] args) {
		// Array is fixed size collection of data of the same type
		//  0   1  2  3  4  5  6
		// [99, 88, 0, 0, 0, 0, 0]
		int[] numbers = new int[5];
		
		numbers[0] = 99;
		numbers[1] = 88;
		
		System.out.println(numbers[0]); // 99
		
		//                   0      1        2        3
		String[] names = {"Alex", "Kuba", "Neeru", "John"};
		int size = names.length;
		System.out.println("Size: " + size);
		
		for (int i = 0; i < size; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println(names); // [Ljava.lang.String;@1dbd16a6
		
	}
}
