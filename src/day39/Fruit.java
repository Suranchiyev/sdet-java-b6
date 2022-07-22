package day39;

import java.util.Map;
import java.util.HashMap;

public class Fruit {
	public static void main(String[] args) {
		Map<String, Double> fruits = new HashMap<>();
		
		// Map is key value based data structure.
		// Map<Key, Value>
		// The keys are unique in the Map
		
		// put(Key,Value) adds new element to the map
		
		fruits.put("Orange", 1.5);
		fruits.put("Mango", 0.5);
		fruits.put("Apple", 0.73);
		fruits.put("Lemon", 1.47);
		
		System.out.println(fruits);
		// {Apple=0.73, Mango=0.5, Orange=1.5, Lemon=1.47}
		
		// get(Key) it returns the value based on the key
		double price = fruits.get("Mango");
		System.out.println("Mango price: " + price);
		
		// We cannot get values based on index
		Double priceTwo = fruits.get(1);
		System.out.println(priceTwo);
		
		// if key doesn't exist, map will return null
		Double priceThree = fruits.get("Banana");
		System.out.println(priceThree);
		
		price = fruits.get("Lemon");
		System.out.println(price);
		
		System.out.println("-----");
		
		System.out.println(fruits); // {Apple=0.73, Mango=0.5, Orange=1.5, Lemon=1.47}
		fruits.put("Lemon", 5.5);
		
		// - Keys are unique in the map
		// - if try to put the same key with different value, it will override old value
		System.out.println(fruits); // {Apple=0.73, Mango=0.5, Orange=1.5, Lemon=5.5}
	}
}




