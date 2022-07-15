package day35;

import java.util.ArrayList;

public class NameList {
	public static void main(String[] args) {
		// Array is fixed sized collection of variables of the same type
		// - fixed size
		// - it can work with primitives and Objects
		
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Bob";
		names[2] = "Alex";
		// names[3] = "Kuba"; // OutOfBound exception
		System.out.println(names);
		
		ArrayList<String> listNames = new ArrayList<>();
		// <String> - data type that ArrayList will hold
		// add(element) add new element to the list
		listNames.add("John");
		listNames.add("Bob");
		listNames.add("Alex");
		listNames.add("Kuba");
		//                                   0    1    2      3
		System.out.println(listNames); // [John, Bob, Alex, Kuba]
		
		// get(index of element) -> read specific element by index
		System.out.println(listNames.get(1)); // Bob
		String firstEl = listNames.get(0);
		System.out.println(firstEl); // John
		
		// change value of specific element by index
		listNames.set(0, "Ramesh");
		System.out.println("---------");
		
		// I want to create list of int numbers
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println(numbers);
		numbers.add(1);
		numbers.add(2);
		System.out.println(numbers);
		
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println(numbers);
		
		int firstElNumber = numbers.get(0);
	    int lastElNumber = numbers.get(4);
	    System.out.println("first element: " + firstElNumber);
	    System.out.println("last element: " + lastElNumber);
	    
	    numbers.set(2, 7);
	    System.out.println(numbers); // [1, 2, 7, 4, 5]
	    
	    // add(element) - add new element to the right side of the list
	    // get(index)   - read element by index
	    // set(index, new value) - change value of existing element
	    
	    // I want to create list of chars with values:
	    // ['a', 'b', 'c']
	    
	    ArrayList<Character> chars = new ArrayList<>();
	    chars.add('a');
	    chars.add('b');
	    chars.add('c');   
	    //                             0  1  2
	    System.out.println(chars); // [a, b, c]
	    
	    chars.set(0, 'A'); // change value of first element
	    
	    chars.add('d'); // add new element
	    
	    System.out.println(chars); // [A, b, c, d]
	    // BREAK TILL 8:11PM EST
	}
}
