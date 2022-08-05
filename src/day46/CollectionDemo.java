package day46;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
//		Set<Integer> set = new LinkedHashSet<>();
//		Set<Integer> set = new TreeSet<>();
		
		set.add(5);
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(-2);
		
		System.out.println("Size: " + set.size());
		System.out.println(set);
	}
}
