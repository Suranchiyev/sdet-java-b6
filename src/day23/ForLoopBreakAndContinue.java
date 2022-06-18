package day23;

public class ForLoopBreakAndContinue {
	public static void main(String[] args) {
		// break     - breaks the loop
		// continue  - skips the current iteration
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break; // exit from the loop
			}
			
			System.out.print(i + " ");
		}
		System.out.println();
	
		for (int i = 1; i <= 100; i++) {
			if (i == 7 || i == 13 || i == 9) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		
	}
}
