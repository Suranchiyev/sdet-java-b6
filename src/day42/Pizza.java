package day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. Remove direct access
//    - make property private
//    - if it is mutable object, in the getter return copy of it and in the setter
//      assign copy of argument.
                
public class Pizza {
	public static final String[] TOPPINGS = {"cheese", "chicken", "pepperoni"};
	
	private List<String> toppings;
	
	public List<String> getToppings() {
		// we need to return copy of mutable objects
		return new ArrayList<>(toppings);
	}
	
	public void setToppings(List<String> toppings) {
		for (String topping : toppings) {
			if (!Arrays.asList(TOPPINGS).contains(topping)) {
				throw new IllegalArgumentException("Invalid topping: " + topping);
			}
		}
		
		// we need to assign a copy of mutable object(List)
		this.toppings = new ArrayList<>(toppings);
	}
}
