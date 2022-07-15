package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListInternally {
	public static void main(String[] args) {
		// How does ArrayList list work internally?
		// ArrayList internally based on array
		
		
		// when we create ArrayList in the background array will be created
		// the default size of internal array is 10
		// when number of elements will grow the ArrayList
		// will resize its internal array and grow automatically
		
		List<Integer> list = new ArrayList<>(1000);
		// if we know that list will hold huge number of elements we can create 
		// with bigger initial capacity. So it will not keep resizing the inner array.
		
		System.out.println(list);
		System.out.println(list.size());
		
		for (int i = 0; i < 1000; i++) {
			list.add(new Random().nextInt(1001));
		}
		
		System.out.println(list);
		System.out.println(list.size());
	}
}




