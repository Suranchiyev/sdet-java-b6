package day42;

import java.util.HashMap;
import java.util.Map;

public class GroceryStoreDemo {
	public static void main(String[] args) {
		GroceryStore gs = new GroceryStore();
		// add some correct items
		Map<String, Double> newItems = new HashMap<>();
		newItems.put("apple", 3.5);
		newItems.put("banana", 1.5);
		gs.setItems(newItems);
		
		
		Map<String, Double> items = gs.getItems();
		items.put("orange", 6.0);
		items.put("abc", 100.0);
		System.out.println("My items: " + items);
		
		System.out.println("Original: " + gs.getItems()); // {banana=1.5, orange=6.0, apple=3.5}
		System.out.println("----------");
		
		
		GroceryStore gsTwo = new GroceryStore();
		
		Map<String, Double> newItemsTwo = new HashMap<>();
		newItemsTwo.put("apple", 1.3);
		newItemsTwo.put("banana", 0.5);
		newItemsTwo.put("kiwi", 4.5);
		// newItemsTwo.put("orange", 5.5);
		gsTwo.setItems(newItemsTwo);
		
		newItemsTwo.put("orange", 5.5);
		System.out.println("New items: " + newItemsTwo);
		
		System.out.println("Original: " + gsTwo.getItems());
		
	}
}
