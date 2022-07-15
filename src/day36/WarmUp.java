package day36;

import java.util.ArrayList;

public class WarmUp {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		// <Integer> - the data type our ArrayList can hold
		
		numbers.add(5);
		numbers.add(4);
		System.out.println(numbers); // [5, 4]
		
		numbers.add(7);
		numbers.add(9);
		System.out.println(numbers); // [5, 4, 7, 9]
		// TODO
		// set(indexWeWantToSet, newValue);
		numbers.set(2, 12);
		System.out.println(numbers); // [5, 4, 12, 9]
		
		// remove(index)
		// remove(value)
		
		// numbers.remove(1); // remove by index
		Integer value = 4;
		numbers.remove(value);
		
		System.out.println(numbers); // [5, 12, 9]
		
		int sizeOfList = numbers.size();
		System.out.println("Size of list: " + sizeOfList);
	}
}
