package day25;

public class LibraryTwo {
	public static void main(String[] args) {
		Book book = new Book();
		
		Book bookTwo = new Book("OCA", "Jeanne Boyarsky", 500);
		System.out.println(bookTwo.title); // OCA
		System.out.println(bookTwo.author); // Jeanne Boyarsky
		System.out.println(bookTwo.pages); // 500
		System.out.println("----------");
		
		Book bookThree = new Book("OCP", 900);
		System.out.println(bookThree.title); // OCP
		System.out.println(bookThree.author); // null
		System.out.println(bookThree.pages); // 900
		
	}
}
