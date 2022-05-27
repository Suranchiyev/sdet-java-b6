package day9;

public class Project3 {
    public static void main(String args[]){
        System.out.println(max(1, 2));
    }
    
 	public static int max(int num1, int num2) {
 		if (num1 > num2) {
 			return num1;
 		} else {
 			return num2;
 		}
 	}
}