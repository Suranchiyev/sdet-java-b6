package day25;

public class Library {
	public static void main(String[] args) {
		// TODO
		// Create 2 objects from Book class
		// Assign all values (any value) for each property
		// Print all the values from both objects
		
		Book bookOne = new Book();
		bookOne.title = "OCA";
		bookOne.author = "Jeannne Boyarsky";
		bookOne.pages = 500;
		
		System.out.println(bookOne.title);
		System.out.println(bookOne.author);
		System.out.println(bookOne.pages);
		System.out.println("-------");
		
		Book bookTwo = new Book();
		bookTwo.title = "OCP";
		bookTwo.author = "Scott Selikoff";
		bookTwo.pages = 900;
		
		System.out.println(bookTwo.title);
		System.out.println(bookTwo.author);
		System.out.println(bookTwo.pages);
	}
}
