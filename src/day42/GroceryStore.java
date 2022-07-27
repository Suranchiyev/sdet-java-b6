package day42;

import java.util.HashMap;
import java.util.Map;

public class GroceryStore {
	public static final double MAX_PRICE = 5.0;
	
	private Map<String, Double> items;
	
	public Map<String, Double> getItems() {
		return new HashMap<>(items);
	}
	
	public void setItems(Map<String, Double> items) {
		for (String key : items.keySet()) {
			if (items.get(key) > MAX_PRICE) {
				System.out.println(key + ": " + items.get(key));
				throw new IllegalArgumentException("Price cannot be higher than " + MAX_PRICE);
			}
		}
		
		this.items = new HashMap<>(items);
	}
}
