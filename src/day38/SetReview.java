package day38;

// we can import all classes from specific package by using *
import java.util.*;

//import java.util.Set;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.TreeSet;

public class SetReview {
	public static void main(String[] args) {
		// Set is a collection of data that doesn't allow duplicates
		// Set has three implementations:
		// 1. HashSet
		//    - it doesn't maintain insertion order
		// 2. LinkedHashSet
		//    - it maintains insertion order
		// 3. TreeSet
		//    - sorted implementation of set
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(6);
		numbers.add(7);
		numbers.add(6);
		numbers.add(0);
		numbers.add(-1);
		System.out.println(numbers); // [0, -1, 6, 7]
		
		Set<Integer> numbersTwo = new LinkedHashSet<>();
		numbersTwo.add(6);
		numbersTwo.add(7);
		numbersTwo.add(6);
		numbersTwo.add(0);
		numbersTwo.add(-1);
		System.out.println(numbersTwo); // [6, 7, 0, -1]
		
		Set<Integer> numbersThree = new TreeSet<>();
		numbersThree.add(6);
		numbersThree.add(7);
		numbersThree.add(6);
		numbersThree.add(0);
		numbersThree.add(-1); 
		System.out.println(numbersThree); // [-1, 0, 6, 7]
	}
}
