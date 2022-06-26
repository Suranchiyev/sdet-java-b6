package day27;

public class GarbageCollection {
	/*
	 * GC is process that cleans up unreachable objects from the heap automatically.
	 * unreachable object - an object that doesn't contain any reference to it.
	 * unreachable objects are eligible for GC.
	 */
	public static void main(String[] args) {
		/*
		 * How object gets eligible for GC(how to make it)?
		 * 1. Nullifying the reference
		 * 2. Re-assigning the reference
		 * 3. An object create inside the method(method frame got destroyed)
		 */
		
		// Nullifying the reference
		Book b = new Book("A", "John", 10);
		
		// In java, null can be assigned to any reference(non-primitive type)
		// to indicate that the reference does not refer to any object(or array).
		b = null;
		
		// Re-assigning the reference
		Book b2 = new Book("B", "Alex", 12);
		Book b3 = new Book("C", "Kuba", 14);
		b2 = b3;
		
		testMethod();
		// Should we always make our object eligible for GC? NO
		
		// How do you call GC in java?
		// We cannot call GC in java because it is 100% automatic process.
		// However we can request GC to clean up(It is not guaranteed that GC will do clean up)
		
		// #1 Using system class
		System.gc();
		
		// #2 Using Runtime class
		Runtime.getRuntime().gc();
		
		// What's finalize() method?
		// Before destroying an object, GC calls finilize() method to 
		// perform clean up. Once finilize() method is done it will destroy the object.
		// We can override this method to perform custom clean up(ex: close connections)
	}
	
	public static void testMethod() {
		System.out.println("method starts");
		Book book = new Book("D", "Florencia", 25);
		System.out.println("method ends");
	}
}









