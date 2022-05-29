package day12;

public class Grade {	
	public static void main(String[] args) {
		char grade = getGrade(95); 
		System.out.println(grade); // A
		
		grade = getGrade(80); 
		System.out.println(grade); // B
		
		grade = getGrade(65); 
		System.out.println(grade); // D
		
		grade = getGrade(50); 
		System.out.println(grade); // F
		
		grade = getGrade(120); 
		System.out.println(grade); // 0
		
		grade = getGrade(-2); 
		System.out.println(grade); // 0
		
	}
	
	/*
	 * if score within 90 and 100 inclusive -> 'A'
	 * if score within 80 and 89 inclusive  -> 'B'
	 * if score within 70 and 79 inclusive  -> 'C'
	 * if score within 60 and 69 inclusive  -> 'D'
	 * if score within 0  and 59            -> 'F'
	 * if score is not in above condition   -> '0'
	 * 
	 */
	public static char getGrade(int score) {
		if (score >= 90 && score <= 100) {
			return 'A';
			
		} else if (score >= 80 && score <= 89) {
			return 'B';
			
		} else if (score >= 70 && score <= 79) {
			return 'C';
			
		} else if (score >= 60 && score <= 69) {
			return 'D';
			
		} else if (score >= 0 && score <= 59) {
			return 'F';
		} else {
			return '0';
		}
	}
}
