package day36;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListAndCollections {
	public static void main(String[] args) {
		int[] array = {4, 9, 8, 2, 1, 0, 15};
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		System.out.println("------");
		
		List<Integer> list = new ArrayList<>(Arrays.asList(4, 9, 8, 2, 1, 0, 15));
		System.out.println(list);
		// to sort list we use Collections helper class
		Collections.sort(list);
		System.out.println(list); // [0, 1, 2, 4, 8, 9, 15]
		
		int index = Collections.binarySearch(list, 9);
		System.out.println("Index: " + index);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		// adding multiple elements at the same time
		Collections.addAll(list, 99, 100, 999, 99);
		System.out.println(list);
	}
}
