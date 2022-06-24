package day26;

public class PersonMethodDemo {
	public static void main(String[] args) {
		Person person = new Person("John", "Doe", 28);
		person.printFullName(); // John Doe
		System.out.println("--------");
		
		Person personTwo = new Person("Will","Smith", 35);
		personTwo.printFullName(); 
		System.out.println("--------");
		
		String resOne = person.getFullDetails();
		System.out.println(resOne); // John Doe 28
		
		String resTwo = personTwo.getFullDetails();
		System.out.println(resTwo); // Will Smith 35
		System.out.println("--------");
		
		person.increaseAge(2);
		personTwo.increaseAge(4);
		
		resOne = person.getFullDetails();
		System.out.println(resOne);
		
		resTwo = personTwo.getFullDetails();
		System.out.println(resTwo);
	}
}
