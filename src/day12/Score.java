package day12;

public class Score {
	public static void main(String[] args) {
		displayGradeMsg('A'); // Your score more than 90
		displayGradeMsg('a'); // Your score more than 90
		displayGradeMsg('B'); // Your score within 80 - 89 range
		displayGradeMsg('c'); // Your score within 70 - 79 range
		displayGradeMsg('F'); // Your score is less than 59
		displayGradeMsg('o'); // Invalid grade(it can be: A,a,B,b,C,c,D,d,F,f)
	}
	
	/*
	 * A or a - Your score more than 90
	 * B or b - Your score within 80 - 89 range
	 * C or c - Your score within 70 - 79 range
	 * D or d - Your score within 60 - 69 range
	 * F or f - Your score is less than 59
	 * for any other chars - Invalid grade(it can be: A,a,B,b,C,c,D,d,F,f)
	 */
	public static void displayGradeMsg(char grade) {
		if (grade == 'A' || grade == 'a') {
			System.out.println("Your score more than 90");
			
		} else if (grade == 'B' || grade == 'b') {
			System.out.println("Your score within 80 - 89 range");
			
		} else if (grade == 'C' || grade == 'c') {
			System.out.println("Your score within 70 - 79 range");
			
		} else if (grade == 'D' || grade == 'd') {
			System.out.println("Your score within 60 - 69 range");
			
		} else if (grade == 'F' || grade == 'f') {
			System.out.println("Your score is less than 59");
			
		} else {
			System.out.println("Invalid grade(it can be: A,a,B,b,C,c,D,d,F,f)");
		}
	}
}
