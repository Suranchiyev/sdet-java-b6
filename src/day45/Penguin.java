package day45;

public class Penguin implements CanSwim {
	@Override
	public void swim() {
		System.out.println("Penguin is swimming..");
	}
	
	@Override
	public void dive() {
		System.out.println("Penguin is diving..");
	}
	
	public static void main(String[] args) {
		CanSwim obj = new Penguin();
		obj.dive();
		obj.swim();
	}
}
