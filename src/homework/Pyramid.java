package homework;

public class Pyramid {
	public static void main(String[] args) {
		makePyramid(7);
    }
	
	public static void makePyramid(int num) {
		// your code goes here
      //int n = num;
      
      for (int i = 1; i <= num && num <= 8; i++) {
      	for (int j = 1; j <= num - i; j++) {
        	System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
        	System.out.print("#");
        }
        System.out.print("  ");
        
        for (int j = 1; j <= i; j++) {
        	System.out.print("#");
        }
        System.out.println();
      }
      if (num <= 0 || num > 8) {
      	System.out.println("INVALID INPUT");
      }
	}
}
