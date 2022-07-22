package day39;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class FruitTwo {
	public static void main(String[] args) {
		Map<String, Double> fruits = new HashMap<>();
		// TODO
		// put(key, value)
		
		fruits.put("Banana", 1.39);
		fruits.put("Watermelon", 3.28);
		fruits.put("Orange", 1.05);
		fruits.put("Mango", 0.5);
		System.out.println(fruits); // {Banana=1.39, Watermelon=3.28, Orange=1.05, Mango=0.5}
		
		// get price of Watermelon
		double price = fruits.get("Watermelon");
		System.out.println(price);
		                     
		double totalPrice = fruits.get("Orange") + fruits.get("Mango") + fruits.get("Banana");
		
		// Get the price of Orange + Mango + Banana
		System.out.println("The total price of Orange, Mango, and Banana: "+ totalPrice); 
		
		// if the key is not in the map, get(Key) returns null 
		System.out.println(fruits.get("abc")); // null
		System.out.println(fruits.get("orange")); // null
		System.out.println("----------");
		
		// containsKey(Key), it checks if key in the map
		boolean isKeyThere = fruits.containsKey("Kiwi");
		System.out.println(isKeyThere); // false
		
		if (fruits.containsKey("Orange")) {
			System.out.println("Price: " + fruits.get("Orange"));
		} else {
			System.out.println("Item is not there.");
		}

		// containsValue(Value), it checks if the value in the map
		System.out.println(fruits.containsValue(1.05)); // true
		System.out.println(fruits.containsValue(99.9)); // false
		System.out.println("---------");
		
		System.out.println(fruits);
		// remove(key), it removes key/value pair from the map
		fruits.remove("Banana");
		System.out.println(fruits);
		
		fruits.remove("Kiwi");
		System.out.println(fruits);
		System.out.println("---------");
		
		// keySet() return set of keys
		Set<String> fruitKeys = fruits.keySet();
		System.out.println(fruitKeys);
		
		Collection<Double> list = fruits.values();
		System.out.println(list);
	}
}






