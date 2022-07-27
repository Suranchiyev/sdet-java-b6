package day42;

import java.util.Arrays;

public class LibraryDemo {
	public static void main(String[] args) {
		Library lib = new Library();
		String[] books = {"java 101", "oca java", "ocp java"};
		lib.setBookList(books);
		
		System.out.println("Original books: " + Arrays.toString(lib.getBookList())); // Original books: [java 101, oca java, ocp java]
		books[0] = "python";
		
		System.out.println("Input books: " + Arrays.toString(books)); // Input books: [python, oca java, ocp java]
		System.out.println("Original books: " + Arrays.toString(lib.getBookList())); // Original books: [java 101, oca java, ocp java]
		
		System.out.println("-----");
		
		String[] booksFromLib = lib.getBookList();
		booksFromLib[1] = "php 101";
		System.out.println("Original books: " + Arrays.toString(lib.getBookList())); // Original books: [java 101, oca java, ocp java]
		
	}
}
