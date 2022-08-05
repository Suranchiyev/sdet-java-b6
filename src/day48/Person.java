package day48;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age <= 0) {
			// throwing runtime exception
			throw new IllegalArgumentException("age is invalid: " + age);
		}
		
		this.age = age;
	}
	
	public void read(String bookTitle) throws Exception {
		if (bookTitle.isEmpty()) {
			// throwing checked exception
			throw new Exception("Book title is not valid");
		}
		
		System.out.println("Reading " + bookTitle);
	}
	
	
}
