package day45;

public class BoxDemo {
	public static void main(String[] args) {
		// we cannot create object directly from interface
		// Box box = new Box();
		
		Box box = new SmallBox();
		box.add("apple");
	}
}
