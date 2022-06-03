package day14;

public class Grade {
	public static void main(String[] args) {
		/*
		 * - byte and Byte
		 * - short and Short
		 * - int and Integer
		 * - char and Character
		 * - String
		 * - enum values
		 */
		
		displayGradeMsg('A'); // Your score was between 90 and 100
		displayGradeMsg('c'); // Your score was between 50 and 64
		displayGradeMsg('f'); // Your score was less than 50
		displayGradeMsg('?'); // Not valid grade
	}
	
	/*
	 * 'A' or 'a' -> Your score was between 90 and 100
	 * 'B' or 'b' -> Your score was between 65 and 89
	 * 'C' or 'c' -> Your score was between 50 and 64
	 * 'F' or 'f' -> Your score was less than 50
	 * otherwise  -> Not valid grade
	 */
	public static void displayGradeMsg(char grade) {
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Your score was between 90 and 100");
			break;			
		case 'B':
		case 'b':
			System.out.println("Your score was between 65 and 89");
			break;
		case 'C', 'c': // this feature is available from java 11
			System.out.println("Your score was between 50 and 64");
			break;
		case 'F', 'f':
			System.out.println("Your score less than 50");
			break;
		default:
			System.out.println("Not valid grade");
		}
	}
}
