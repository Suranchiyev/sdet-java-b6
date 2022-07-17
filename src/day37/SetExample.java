package day37;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		numbers.add(2);
		numbers.add(0);
		numbers.add(-2);
		
		// Set doesn't allow duplicates
		// HashSet implementation doesn't maintain insertion (any) order
		System.out.println(numbers); // [0, 1, -2, 2, 3, 4]
		
		// System.out.println(numbers.get(0));
		// We cannot get single element of set by index
		for (int number : numbers) {
			System.out.println(number);
		}
		System.out.println("------");
		
		Set<Integer> numbersTwo = new LinkedHashSet<>();
		// LinkedHashSet does maintain insertion order 
		
		numbersTwo.add(3);
		numbersTwo.add(4);
		numbersTwo.add(3);
		numbersTwo.add(2);
		numbersTwo.add(1);
		numbersTwo.add(2);
		numbersTwo.add(0);
		System.out.println(numbersTwo); // [3, 4, 2, 1, 0]
		System.out.println("------");
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("John");
		treeSet.add("Alex");
		treeSet.add("Azamat");
		treeSet.add("Bek");
		System.out.println(treeSet); // [Alex, Azamat, Bek, John]
		// TreeSet is sorted implementation of Set
	}
}
