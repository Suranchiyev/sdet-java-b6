package day38;

import java.util.List;
import java.util.ArrayList;

public class Library {
	public String name;
	public String address;
	private List<Book> books;
	
	public Library(String name, String address) {
		this.name = name;
		this.address = address;
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		if (books != null) {
			books.add(book);
		}
	}
	
	public int getNumberOfBooks() {
		return books.size();
	}
	
	public Book getBookByTitle(String searchTitle) {
		for (Book eachBook : books) {
			if (eachBook.title.equals(searchTitle)) {
				return eachBook;
			}
		}
		
		return null;
	}
	
	public List<Book> getBooksByRating(Rating requestedRating) {
		List<Book> res = new ArrayList<>();
		for (Book eachBook : books) {
			if (eachBook.rating.equals(requestedRating)) {
				res.add(eachBook);
			}
		}
		return res;
	}
	
	// TODO remove book from library
	public boolean removeBook(String title) {
		return false;
	}
}
