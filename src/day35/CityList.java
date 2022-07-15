package day35;

import java.util.ArrayList;

public class CityList {
	public static void main(String[] args) {
		// remove details
		// contains
		// indexOf
		
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		//                               0  1  2  3
		System.out.println(numbers); // [1, 2, 3, 4]
		
		// remove(int index)
		// remove(Integer value)
		
		numbers.remove(1);
		// it removed by index, and element under index 1 is removed
		
		System.out.println(numbers);
		
		Integer value = 4;
		numbers.remove(value); // remove by value
		System.out.println(numbers);
		System.out.println("-----------");
		
		// contains
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Aldie");
		cities.add("Chantilly");
		cities.add("Arligton");
		cities.add("Hyannis");
		cities.add("Karaganda");
		System.out.println(cities);
		
		System.out.println(cities.contains("Aldie")); // true
		System.out.println(cities.contains("Tysons")); // false
		System.out.println(cities.contains("hyannis")); // false
		System.out.println(cities.contains("Hyannis")); // true
		System.out.println("------------");
		
		// indexOf
		System.out.println(cities.indexOf("Aldie")); // 0
		System.out.println(cities.indexOf("Tysons")); // -1
		System.out.println(cities.indexOf("Karaganda")); // 4
		
	}
}
