package day36;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Countries {
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("USA", "UK", "Canada", "Brazil");
		// when we create our list using Arrays.asList it will create fixed size list
		
		System.out.println(countries);
		System.out.println(countries.get(0));
		System.out.println(countries.get(countries.size() - 1));
		// countries.add("Bolivia");
		// countries.remove(0);
		System.out.println("------");
		
		List<String> countriesTwo = new ArrayList<>(Arrays.asList("USA", "UK", "Canada"));
		System.out.println(countriesTwo);
		countriesTwo.add("Brazil");
		countriesTwo.add("Bolivia");
		System.out.println(countriesTwo);
		
		countriesTwo.remove(0);
		System.out.println(countriesTwo);
	}
}
