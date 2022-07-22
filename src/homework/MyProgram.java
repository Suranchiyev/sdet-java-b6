package homework;

public class MyProgram extends Thread {
	String data;
	
	public MyProgram(String data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		new MyProgram("A").start();
		new MyProgram("B").start();
		new MyProgram("C").start();
		new MyProgram("D").start();
//		new MyProgram("A").run();
//		new MyProgram("B").run();
//		new MyProgram("C").run();
//		new MyProgram("D").run();
	}
	
	
	@Override
	public void run() {
		// new MyData().data.put(1, this.data);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}
	}
}	
