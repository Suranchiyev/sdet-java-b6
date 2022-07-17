package day38;

public class Book {
	public String title;
	public String author;
	public int pages;
	public Rating rating;
	
	public Book() {}
	
	public Book(String title, String author, int pages, Rating rating) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", rating=" + rating + "]";
	}

	
}
