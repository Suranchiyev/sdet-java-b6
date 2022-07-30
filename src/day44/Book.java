package day44;

// every class in Java automatically inherits 
// java.lang.Object class
public class Book {
	public String title;
	public int pages;
	
	public Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
	
	public Book() {
		
	}
	
	@Override
	public String toString() {
		return "title: " + title +", pages: "+pages;
	}
	
	@Override
	public boolean equals(Object o) {
		Book argBook = (Book)o;
		return title.equals(argBook.title) && pages == argBook.pages;
	}
	
	@Override
	public int hashCode() {
		return title.hashCode() + pages;
	}
}
