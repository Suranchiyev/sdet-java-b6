package day40;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class MapReview {
	public static void main(String[] args) {
		// Map is key value based data collection
		// keys are unique in map
		
		Map<String, Double> students = new HashMap<>();
		// put(K, V) - add new element to the map
		students.put("John", 90.0);
		students.put("Smith", 65.5);
		students.put("Alex", 100.0);
		students.put("Misha", 96.5);
		
		System.out.println(students);
		
		// get(K) to get a value of that key from the map
		double score = students.get("John");
		System.out.println(score);
		
		// if key is not in the map, the get(K) returns null
		System.out.println(students.get("Kuba")); // null
		
		// remove(K) - remove element by key from the map
		students.remove("Alex");
		System.out.println(students);
		
		// containsKey(K) - check if key in the map or not
		System.out.println(students.containsKey("Kuba")); // false
		System.out.println(students.containsKey("Misha")); // true
		
		// containsValue(V);
		System.out.println(students.containsValue(90.0));
		
		Collection<Double> mapValues = students.values();
		System.out.println(mapValues); // [65.5, 90.0, 96.5]
		
		// How to iterate over the map?
		// What does keySet() do? it return set of keys
		System.out.println(students);
		System.out.println("keys: " + students.keySet());
		
		for (String mapKey : students.keySet()) {
			System.out.println(mapKey + " - " + students.get(mapKey));	
		}
	}
}
