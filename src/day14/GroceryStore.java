package day14;

import util.InputFromUser;

public class GroceryStore {
	public static void main(String[] args) {
		String itemName = InputFromUser.getInput("Enter item name:");
		/*
		 * bread -> 4.99 water -> 2.99 apple -> 1.50 bear -> 7.9 red bull -> 2.59
		 * 
		 * for any other items print "we don't have it"
		 */
		switch (itemName) {
		case "bread":
			System.out.println("price is 4.99");
			break;
		case "water":
			System.out.println("price is 2.99");
			break;
		case "apple":
			System.out.println("price is 1.50");
			break;
		case "bear":
			System.out.println("price is 7.9");
			break;
		case "red bull":
			System.out.println("price is 2.59");
			break;
		default:
			System.out.println("We don't have it");
			break;
		}

	}
}
