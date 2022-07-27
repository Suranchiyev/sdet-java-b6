package day41;

public class DogDemo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Tuzik");
		dog.setAge(5);
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		System.out.println("------");
		
		Dog dogTwo = new Dog();
		dogTwo.setName("Sharik");
		// dogTwo.setAge(-1); 
		dogTwo.setAge(1);
		
		System.out.println(dogTwo.getName());
		System.out.println(dogTwo.getAge());
		System.out.println("-------");
		
		Dog dogThree = new Dog();
		// TODO
		// Put the logic in Dog class so we cannot assign 
		// null or empty string "" as a name
		dogThree.setName(null);
		dogThree.setAge(4);
		System.out.println(dogThree.getName());
		System.out.println(dogThree.getAge());
	}
}
