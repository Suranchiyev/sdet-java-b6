package day42;

public class BookDemo {
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("Kuba");
		book.setTitle("Selenium Automation");
		book.setPages(200);
		
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		System.out.println(book.getPages());
		System.out.println("-----");
		
		book.setTitle("Selenium Automation 2");
		book.setPages(250);
		
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		System.out.println(book.getPages());
	}
}
