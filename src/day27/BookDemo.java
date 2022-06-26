package day27;

public class BookDemo {
	public static void main(String[] args) {
		Book bOne = new Book("OCA", "Jeanne", 500);
		System.out.println(bOne); // day27.Book@7ad041f3
		bOne.printBookDetails();
		System.out.println("-------");
		
		// we don't copy the object
		// bTwo just started pointing to the same object as bOne
		Book bTwo = bOne;
		bTwo.title = "JAVA OCP";
		
		bTwo.printBookDetails();
		System.out.println("--------");
		bOne.printBookDetails();
	} 
}
