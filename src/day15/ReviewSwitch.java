package day15;

public class ReviewSwitch {
	public static void main(String[] args) {
		/*
		 * byte, Byte
		 * short, Short
		 * int, Integer 
		 * String
		 * Enum values
		 */
		
		char letter = 'E';
		//        E
		switch (letter) {
		case 'A':
			System.out.println("A is good grade");
			
			break;
		case 'B':
			System.out.println("B is good grade");
			break;
		default:
			System.out.println("Invalid grade");
			break;
		}
		
	}
}
