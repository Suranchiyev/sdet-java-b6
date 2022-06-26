package day27;

public class BookDemoTwo {
	public static void main(String[] args) {
		Book bookOne = new Book("Java", "John", 10);
		// Book bookTwo = new Book("Selenium", "Alex", 12);
		
		Book bookTwo = bookOne;
		
		System.out.println(bookOne.title); // Java
		System.out.println(bookTwo.title); // Java
		
		bookOne.title = "Java Introduction";
		
		System.out.println(bookOne.title); // Java Introduction
		System.out.println(bookTwo.title); // Java Introduction
	}
}
