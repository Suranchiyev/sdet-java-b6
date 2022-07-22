package day39;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Country {
	public static void main(String[] args) {
		Map<String, String> countries = new HashMap<>();
		countries.put("USA", "washington");
		countries.put("Canada", "ottawa");
		countries.put("Brazil", "brasilia");
		System.out.println(countries); // {Canada=ottawa, USA=washington, Brazil=brasilia}
		
		// {K=V, K=V, K=V}
		
		// keySet = [K, K, K]
		
		// get(K) -> V
		System.out.println(countries.get("USA")); // washington
		
		// Iterate over the map
		// keySet returns set of keys
		Set<String> keys = countries.keySet();
		System.out.println("Keys: " + keys); // Keys: [Canada, USA, Brazil]
		
		//              : [Canada, USA, Brazil]
		for (String key : keys) {
			String value = countries.get(key);
			System.out.println(key + " - " + value);
			// System.out.println(key + " - " + countries.get(key));
		}
		System.out.println("-------");
		//                                         
		System.out.println(countries); // {Canada=ottawa, USA=washington, Brazil=brasilia}
		
		//              : [Canada, USA, Brazil]
		for (String key : keys) {
			String keyCountry = key;
			String value = countries.get(keyCountry);
			value = value.substring(0, 1).toUpperCase() + value.substring(1);
			countries.put(keyCountry, value); // override old value with new one
		}
		
		System.out.println(countries); // {Canada=Ottawa, USA=Washington, Brazil=Brasilia}
	}
}
