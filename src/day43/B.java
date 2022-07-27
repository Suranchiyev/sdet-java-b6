package day43;

public class B extends A {
	public String name = "B";
	
	@Override
	public void hello() {
		System.out.println("hello from class B");
	}
	
	@Override
	public String getMsg() {
		return "Java is not always fun to learn";
	}
	
	@Override
	public int sum(int num, int num2) {
		return num + num2 + 50;
	}
	
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.name);
		
		// We cannot override instance variables;
		// we can hide/shadow them.
	}
}
