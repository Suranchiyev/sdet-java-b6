package day44;

public class Person {
	public String name;
	public int age;
	public String address;

	
	/*
	 * toString()
	 * It is recommended that all subclasses override this method.
	 * In general, the toString method should return a string that "textually represents"
	 * this object.
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
