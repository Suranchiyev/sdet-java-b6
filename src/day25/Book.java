package day25;

public class Book {
	public String title;
	public String author;
	public int pages;
	
	// TODO your code goes here
	// Create constructors
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
	
	public Book() {
		
	}
}
