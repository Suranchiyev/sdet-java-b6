package day40;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class MapTypes {
	public static void main(String[] args) {
		// Map has 4 different implementations:
		// 1. HashMap
		// 2. Hashtable
		// 3. LinkedHashMap
		// 4. TreeMap
		
		// HashMap does not maintain insertion order
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "four");
		hashMap.put(3, "three");
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(0, "zero");
		hashMap.put(-7, "minus seven");
		hashMap.put(null, "A");
		hashMap.put(9, null);
		hashMap.put(10, null);
		
		System.out.println(hashMap); // {0=zero, 1=one, 2=two, 3=three, 4=four, -7=minus seven}
		System.out.println("-------------");
		
		// Hashtable - older version of HashMap
		// HashMap vs Hashtable
		// 1. HashMap allows one null key and multiple null values, but Hashtable
		//    doesn't allow any null keys and values
		// 2. HashMap is not synchronized and Hashtable is synchronized. 
		//    Not synchronized - not thread safe. These type of classes can act unexpectedly when used 
		//                       in multi-threading environment
		//    Synchronized - thread safe
		
		Map<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(4, "four");
		hashTable.put(3, "three");
		hashTable.put(-7, "minus seven");
		// hashTable.put(null, "A"); // exception here because Hashtable doesn't support null key
		// hashTable.put(9, null); // exception here because Hashtable doesn't support null value
		System.out.println(hashTable); // {-7=minus seven, 4=four, 3=three}

	}
}
