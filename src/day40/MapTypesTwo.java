package day40;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTypesTwo {
	public static void main(String[] args) {
		// Map:
		// 1. HashMap
		// 2. Hashtable
		// 3. LinkedHashMap
		// 4. TreeMap 
		
		// LinkedHashMap - it does maintain insertion order
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(4, "four");
		linkedHashMap.put(3, "three");
		linkedHashMap.put(1, "one");
		linkedHashMap.put(2, "two");
		linkedHashMap.put(0, "zero");
		System.out.println(linkedHashMap); // {4=four, 3=three, 1=one, 2=two, 0=zero}
		System.out.println("---------");
		
		// TreeMap - sorted by key implementation of the Map
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(4, "four");
		treeMap.put(3, "three");
		treeMap.put(1, "one");
		treeMap.put(2, "two");
		treeMap.put(0, "zero");
		treeMap.put(-7, "minus seven");
		// treeMap.put(null, null);
		System.out.println(treeMap); // {-7=minus seven, 0=zero, 1=one, 2=two, 3=three, 4=four}
	}
}
