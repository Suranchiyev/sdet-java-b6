package day35;

import java.util.ArrayList;

public class FruitList {
	public static void main(String[] args) {
		// TODO
		// Create ArrayList<String> fruitList
		// Add 5 elements (fruit names)
		// Print each element in the new line
		
		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("orange");
		fruitList.add("kiwi");
		fruitList.add("mango");
		System.out.println(fruitList);
		System.out.println("--------");
		
		for (int i = 0; i < fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
		System.out.println("--------");
		for (String fruit : fruitList) {
			System.out.println(fruit);
		}
		System.out.println("--------");
		// TODO 
		// Make all elements of fruitList in upper case
		// Use set method to do so.
		
		for (int i = 0; i < fruitList.size(); i++) {
			String element = fruitList.get(i);
			fruitList.set(i, element.toUpperCase());
		}
		System.out.println(fruitList); // [APPLE, BANANA, ORANGE, KIWI, MANGO]
	}
}
