package day42;

import java.util.Arrays;

public class Library {
	public static final String KEYWORD = "java";
	
	// in our library every book should contain in their
	// title given KEYWORD(java)
	private String[] bookList;
	
	public String[] getBookList() {		
		return Arrays.copyOf(bookList, bookList.length);
	}
	
	public void setBookList(String[] bookList) {
		for (String bookTitle : bookList) {
			if (!bookTitle.contains(KEYWORD)) {
				throw new IllegalArgumentException("All titles should contain " + KEYWORD);
			}
		}
		
		this.bookList = Arrays.copyOf(bookList, bookList.length);
	}
}
