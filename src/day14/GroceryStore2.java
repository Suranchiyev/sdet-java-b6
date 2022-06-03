package day14;

public class GroceryStore2 {
	public static void main(String[] args) {
		printItemPrice("bread"); // 4.99
		printItemPrice("water"); // 2.99
		printItemPrice("beer"); // 7.9
		printItemPrice("red bull"); // 2.59
		printItemPrice("orange"); // we don't have it
		printItemPrice("abc"); // we don't have it
		
		double price = getItemPrice("apple");
		System.out.println("apple - " + price);
	}
	
	/*
	 * bread 	-> 4.99
	 * water 	-> 2.99
	 * apple 	-> 1.50
	 * beer 	-> 7.9
	 * red bull -> 2.59
	 * for any other items print "we don't have it"
	 */
	public static void printItemPrice(String item) {
		switch(item) {
		case "bread":
			System.out.println(4.99);
			break;
		case "water":
			System.out.println(2.99);
			break;
		case "apple":
			System.out.println(1.50);
			break;
		case "beer":
			System.out.println(7.9);
			break;
		case "red bull":
			System.out.println(2.59);
			break;
		default:
			System.out.println("we don't have it");
		}
	}
	
	public static double getItemPrice(String item) {
		switch(item) {
			case "bread": 
				return 4.99;
				// break; we cannot break after the return because
				// return exits from the method.
			case "water": 
				return 2.99;
			case "apple": 
				return 1.50;
			case "beer": 
				return 7.9;
			case "red bull": 
				return 2.59;
			default:
				return -1.0;
		}
	}
	
	
}







