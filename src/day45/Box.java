package day45;

/*
 * 1. Interface can have only abstract methods
 *    except static and default
 * 
 * 2. All class level variables are public static final
 *    in the interface.
 * 
 * 3. There are many assumed keywords.
 */
public interface Box {
	public static final String MY_CONSTANT = "ABC";
	public static final int MY_INT_CONSTANT = 27;
	
	public abstract void add(String element);
	public abstract String get(int index);
	public abstract int size();
	
	// in the interface static methods can have bodies
	public static void printDetails() {
		System.out.println("Printing box details");
	}
	
	public default void myDefaultMethod() {
		System.out.println("In the default method");
	}
}
