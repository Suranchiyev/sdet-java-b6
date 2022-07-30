package day45;

// We can implement multimle interfaces at the same time
public class Eagle implements Animal, CanFly {

	@Override
	public void fly() {
		System.out.println("Eagle is flying..");
	}

	@Override
	public void eat() {
		System.out.println("Eagle is eating..");
	}

	@Override
	public void sleep() {
		System.out.println("Eagle is sleeping..");
	}
}
