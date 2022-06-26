package day27;

public class EqualToRef {
	public static void main(String[] args) {
		Book bookOne = new Book("OCA", "Jeanne", 500);
		Book bookTwo = new Book("OCA", "Jeanne", 500);
		
		// == with object references
		// when two object references are compared with ==
		// operator, it returns true when both references point
		// to the same object; otherwise false.
		
		if (bookOne == bookTwo) {
			System.out.println("these two references point to the same object");
		} else {
			System.out.println("these two references don't point to the same object");
		}
		System.out.println("--------");
		
		Book bookThree = new Book("Java", "Savitch", 800);
		Book bookFour = bookThree;
		
		if (bookThree == bookFour) {
			System.out.println("these two references point to the same object");
		} else {
			System.out.println("these two references don't point to the same object");
		}
		
		
	}
}
