package day39;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class City {
	public static void main(String[] args) {
		//       K, V
		Map<String, Integer> cities = new HashMap<>();
		cities.put("Arlington", 229164);
		cities.put("Leesburg", 375629);
		cities.put("Manassas", 451721);
		cities.put("Richmond", 210309);
		cities.put("Alexandria", 147391);
		System.out.println(cities);
		
		for (String key : cities.keySet()) {
			System.out.println("City name: " + key);
			System.out.println("City population: "+ cities.get(key));
			System.out.println("---");
		}
		System.out.println("-----------");
		
		int totalPopulation = 0;
		for (String key : cities.keySet()) {
			totalPopulation += cities.get(key);
		}
		System.out.println("The total population:  " + totalPopulation);
		System.out.println("-----------");
		
		List<String> bigCities = new ArrayList<>();
		// TODO
		// Add to the bigCities list all the cities with population 300000 and bigger
		
		for (String key : cities.keySet()) {
			if (cities.get(key) >= 300000) {
				bigCities.add(key);
			}
		}
		System.out.println("Big cities: " + bigCities); // [Manassas, Leesburg]
		
	}
}
