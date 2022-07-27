package day42;

/*
 * What's encapsulation? 
 * It is data hiding mechanism
 * How to achieve encapsulation? 
 * By making our instance variables private and providing getters and setters to them
 */
public class Book {
	private String title;
	private String author;
	private int pages;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		if (pages <= 0) {
			throw new IllegalArgumentException("Invalid pages: " + pages);
		}
		this.pages = pages;
	}
}
