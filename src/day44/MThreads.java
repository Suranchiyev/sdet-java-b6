package day44;

public class MThreads {	
	public static void main(String[] args) {
		System.out.println("Start:");
		new Thread(() -> print10()).start();
		new Thread(() -> print10()).start();
		System.out.println("End");
	}
	
	public static void print10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
	}
}
