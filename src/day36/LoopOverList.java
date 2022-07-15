package day36;

// import java.util.*; // means import all classes from util package.
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class LoopOverList {
	public static void main(String[] args) {
		List<String> customers = new ArrayList<>();
		customers.add("Oliver");
		customers.add("William");
		customers.add("James");
		customers.add("Anna");
		customers.add("John");
		System.out.println(customers);
		
		//     0       1       2     3     4
		// [Oliver, William, James, Anna, John]
		
		// How we can loop over the list?
		// 1. regular for loop with index
		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i));
		}
		System.out.println("-----");
		
		// 2. for each loop
		// for (Single element of list : list/array)
		for (String name : customers) {
			System.out.println(name);
		}
		System.out.println("-----");
		
		// 3. Iterator
		Iterator<String> iterator = customers.iterator();
		// hasNext() checks if iterator has next element or not
		// next() returns the next element and moves to the it
		//                                             |
		// iterator = [Oliver, William, James, Anna, John]
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
