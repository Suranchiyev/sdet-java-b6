package day44;

public class SuperObjectClass {
	public static void main(String[] args) {
		Book book = new Book("OCA", 350);
		
		System.out.println(book.getClass()); // class day44.Book
		
		
		System.out.println(book.toString()); // title: OCA, pages: 350
		System.out.println(book); // title: OCA, pages: 350
		System.out.println("--------");
		
		System.out.println(book.hashCode()); // 78411
		// System.out.println(book.equals(null)); 
		
		Book book1 = new Book("Java", 100);
		Book book2 = new Book("Java", 100);
		// Are they same?
		// We have two different object with same properties
		
		// equals method by default will work exactly as ==
		// it means it checks if they are pointing to the same 
		// object or not
		if (book1.equals(book2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
	}
}
