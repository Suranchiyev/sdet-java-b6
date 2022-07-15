package day35;

import java.util.ArrayList;

public class CarList {
	public static void main(String[] args) {
		// .add(element) adds new element to the list
		// .add(index, element) adds new element at specified index
		// .get(index) gets element based on specific index
		// .set(index, value) sets new value based on specific index
		
		ArrayList<String> cars = new ArrayList<>();
		// <String> -> what data type list can hold
		System.out.println(cars); // []
		
		cars.add("bmw"); 
		cars.add("audi");
		cars.add("honda");
		System.out.println(cars); // [bmw, audi, honda]
		
		System.out.println(cars.get(0)); // bmw
		System.out.println(cars.get(1)); // audi
		
		cars.add(0, "tesla");
		System.out.println(cars); // [tesla, bmw, audi, honda]
		//     0    1    2     3
		// [tesla, bmw, audi, honda]
		cars.add(2, "ford");
		
		// [tesla, bmw, ford, audi, honda]
		System.out.println(cars);
		
		cars.add(1, "bently");
		System.out.println(cars);
		
		int listSize = cars.size();
		System.out.println("Number of elements: " + listSize);
		
		// remove element from the list
		// remove(index)
		// remove(value)
		
		//    0      1      2     3     4     5
		// [tesla, bently, bmw, ford, audi, honda]
		System.out.println(cars); 
		cars.remove(2); // remove element under index 2
		
		System.out.println(cars); // [tesla, bently, ford, audi, honda]
		
		// I want remove "ford" element
		cars.remove("ford"); // remove element with value "ford"
		System.out.println(cars); // [tesla, bently, audi, honda]
		
		System.out.println("--------");
		
		// I want to print each element in the new line all in upper cases
		for (int i = 0; i < cars.size(); i++) {
			String eachElement = cars.get(i);
			System.out.println(eachElement.toUpperCase());
		}
		System.out.println("--------");
		
		for (String carName : cars) {
			System.out.println(carName.toUpperCase());
		}
	}
}
