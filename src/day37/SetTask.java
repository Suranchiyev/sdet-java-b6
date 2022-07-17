package day37;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class SetTask {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 1, 4)))); // [1, 2, 3, 4]
		System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 3, 1, 2)))); // [1, 2, 3]
		System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(5, 5, 5, 5)))); // [5]
		System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList(6, 7, 8)))); // [6, 7, 8]
		System.out.println("------");
		
		System.out.println(removeDuplicatesTwo(new ArrayList<>(Arrays.asList(1, 2, 3, 1, 4)))); // [1, 2, 3, 4]
		System.out.println(removeDuplicatesTwo(new ArrayList<>(Arrays.asList(1, 2, 3, 3, 1, 2)))); // [1, 2, 3]
		System.out.println(removeDuplicatesTwo(new ArrayList<>(Arrays.asList(5, 5, 5, 5)))); // [5]
		System.out.println(removeDuplicatesTwo(new ArrayList<>(Arrays.asList(6, 7, 8)))); // [6, 7, 8]
		System.out.println("------");
		
		List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 1, 2));
		List<Integer> resNoDup = removeDuplicatesTwo(inputList);
		System.out.println(resNoDup); // [1, 2, 3]
	}
	
	/*
	 * Remove duplicates from list and return it as new one
	 * removeDuplicates([1, 2, 3, 1]) -> [1, 2, 3]
	 * removeDuplicates([1, 2, 3, 3, 1, 2]) -> [1, 2, 3]
	 * removeDuplicates([5, 5, 5, 5]) -> [5]
	 * removeDuplicates([6, 7, 8]) -> [6, 7, 8]
	 */
	public static List<Integer> removeDuplicates(List<Integer> list) {
		List<Integer> res = new ArrayList<>();
		for (int number : list) {
			if (!res.contains(number)) {
				res.add(number);
			}
		}
		return res;
	}
	
	public static List<Integer> removeDuplicatesTwo(List<Integer> list) {
		// create linked hash set to remove duplicates
		Set<Integer> set = new LinkedHashSet<>(list);
		
		// convert back to the list and return it
		List<Integer> resList = new ArrayList<>(set);
		return resList;
		
		// BREAK TILL 10:11AM EST
		// return new ArrayList<>(new LinkedHashSet<>(list));
	}
}


