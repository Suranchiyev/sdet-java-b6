package day33;

import java.util.Arrays;

public class MArray {
	public static void main(String[] args) {
		int[][] numArr = new int[2][3];
		// 2 - size of outer array
		// 3 - size of inner array
		
		//       0             1
 		// [[4],[5],[7]] [[3],[9],[2]] 
		//   0   1   2     0   1   2
		
		numArr[0][0] = 4;
		numArr[1][0] = 3;
		numArr[0][2] = 7;
		
		numArr[0][1] = 5;
		numArr[1][1] = 9;
		numArr[1][2] = 2;

		System.out.println(numArr[0][0]);
		System.out.println(Arrays.toString(numArr));
				
		for (int i = 0; i < numArr.length; i++) { 
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------");
		// left side - single element of array
		// right side - array
		
		//             int[]   int[]
		// numArr => [[][][]],[[][][]]
		for (int[] innerArr : numArr) {
			for (int num : innerArr) {
				System.out.print(num + " ");
			}
			System.out.println();
			
		}

		
		System.out.println("----------");
		//                                                    0  1  2    0  1  2             
		System.out.println(Arrays.deepToString(numArr)); // [[4, 5, 7], [3, 9, 2]]
		System.out.println("----------");
		
		String[][] items = {
				{"apple", "banana", "kiwi"}, 
				{"cucumber", "tomato"}, 
				{"guava", "grape", "mango", "orange"},
				{"corn"}
				};
		
		// [[apple, banana, kiwi], [cucumber, tomato], [guava, grape, mango, orange], [corn]]
		System.out.println(Arrays.deepToString(items)); // 
		System.out.println("----------");
		// TODO I want to print each item inside items array in new lines all in upper cases.
		// ex:
		// APPLE
		// BANANA
		// KIWI
		// CUCUMBER
		// TOMATO
		// ...
		
		//                  0                     1                         2                   3
		// items = [[apple, banana, kiwi], [cucumber, tomato], [guava, grape, mango, orange], [corn]]
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length; j++) {
				System.out.println(items[i][j].toUpperCase());
			}
		}
		System.out.println("----------");
		
		for (String[] itemArray : items) {
			for (String item : itemArray) {
				System.out.println(item.toUpperCase());
			}
		}
 	}
}





