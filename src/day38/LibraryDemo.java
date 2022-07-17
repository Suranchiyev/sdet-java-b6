package day38;

import java.util.List;

public class LibraryDemo {
	public static void main(String[] args) {
		Library lib = new Library("Public Spring Library", "24600 Millstream Dr");
		lib.addBook(new Book("OCA", "Boyrsky", 400, Rating.GOOD));
		lib.addBook(new Book("OCP", "Boyrsky", 900, Rating.GOOD));
		lib.addBook(new Book("Algorithms", "John Doe", 1000, Rating.EXCELLENT));
		lib.addBook(new Book("Java 101", "Alex", 350, Rating.EXCELLENT));
		lib.addBook(new Book("JS 101", "Smith", 550, Rating.BAD));
		
		System.out.println("Number of books in library: " + lib.getNumberOfBooks());
		
		Book myBook = lib.getBookByTitle("Java 101");
		System.out.println(myBook);
		
		List<Book> goodBooks = lib.getBooksByRating(Rating.GOOD);
		System.out.println("Good books:");
		System.out.println(goodBooks);
	}
}
