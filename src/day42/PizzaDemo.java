package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaDemo {
	public static void main(String[] args) {
		Pizza pizzaStore = new Pizza();
		
		List<String> myToppings = new ArrayList<>(Arrays.asList("chicken", "cheese"));
		pizzaStore.setToppings(myToppings);
		myToppings.add("apple");
		System.out.println(pizzaStore.getToppings());
		
		System.out.println("-----");
		List<String> pizzaToppings = pizzaStore.getToppings();
		pizzaToppings.add("banana");
		System.out.println("Pizza Toppings: " + pizzaToppings);
		
		System.out.println("Original: " + pizzaStore.getToppings());
	}
}
