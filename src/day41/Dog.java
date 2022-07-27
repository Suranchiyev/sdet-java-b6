package day41;

public class Dog {
	// private from who excatly?
	// private for the client code that will create object from this class
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	// this is the method you need to change
	public void setName(String name) {
		// to check if object reference points to null or not
		// ref == null
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("name is not valid: " + name);
		}
		
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age <= 0 || age > 30) {
			throw new IllegalArgumentException("Invalid age: " + age);
		}
		
		this.age = age;
	}
}
