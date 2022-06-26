package day27;

public class Book {
	public String title;
	public String author;
	public int numberOfPages;
	
	public Book(String title, String author, int numberOfPages) {
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	public void printBookDetails() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
		System.out.println("number of pages: " + numberOfPages);
	}
}
