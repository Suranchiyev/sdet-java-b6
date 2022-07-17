package homework;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private List<Item> items;
	
	public Project(List<Item> items) {
		this.items = items;
	}
	
	/**
	 * This method should return specific Item object based
	 * on it's name from items list. 
	 * If item by this name is not in the items list
	 * return null.
	 * 
	 */
	public Item getItemByName(String name) {		
		for (Item item : items) {
			if (item.name.equals(name)) {
				return item;
			}
		}
		
		return null;
	}
	
	/**
	 * This method should return List<Item> based on section
	 * section is enum with values: Meat, Seafood, Bakery, Vegetable
	 */
	public List<Item> getItemsBySection(Section section) {
		// TODO
		return null;
	}
	
	/**
	 * This method should return total price of the Item
	 * Note: in order to get price we need multiply priceForSingleItem to amount
	 */
	public double getItemPrice(String itemName) {
		// TODO
		return 0.0;
	}
	
	/**
	 * Get total price for specific section
     * Note: in order to get price we need multiply priceForSingleItem to amount
	 */
	public double getTotalPriceBySection(Section section) {
		// TODO
		return 0.0;
	}
	
	/**
	 * Get total price for all items
	 * Note: in order to get price we need multiply priceForSingleItem to amount
	 */
	public double getTotalPrice() {
		// TODO
		return 0.0;
	}

}



