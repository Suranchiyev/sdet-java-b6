package day25;

public class Restaurant {
	public static void main(String[] args) {
		// we created object out table class
		Table tableOne = new Table();
		
		// new - java keyword to create an object.
		// Table tableOne - reference type
		// tableOne - reference/pointer
		// new Table(); - actual object
		
		// Object properties have default values
		// Object's default value is null
		// For numeric data, the default value is 0
		// For boolean is false
		System.out.println(tableOne.type); // null
		System.out.println(tableOne.color); // null
		System.out.println(tableOne.isReserved); // false
		
		tableOne.type = "4 people table";
		tableOne.color = "black";
		tableOne.isReserved = true;
		System.out.println("----------");
		
		Table tableTwo = new Table("2 people table", "white", false);
		System.out.println(tableTwo.type);
		System.out.println(tableTwo.color);
		System.out.println(tableTwo.isReserved);
		
	}
}
