package day48;

public class CheckedExceptions {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			// this is not compiling because sleep method
			// potentially throws checked exception
			// 1. Handle with try catch
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("-------");
		try {
			waitMin(1);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
	
	public static void waitMin(int minutes) throws InterruptedException {
		// 2. Declare
		Thread.sleep(minutes * 1000 * 60);
	}
}
