package day48;

public class PersonDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("John");
		person.setAge(-2);
		
		try {
			person.read("OCA");
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
}
