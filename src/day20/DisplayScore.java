package day20;

public class DisplayScore {	
	public static void main(String[] args) {
		displayScore2(Grade.A); // score is between 90-100
		displayScore2(Grade.B); // score is between 65-89
		displayScore2(Grade.F); // score is between 0-39
	}
	
	/*
	 * if grade is A, print "score is between 90-100"
	 * if grade is B, print "score is between 65-89"
	 * if grade is C, print "score is between 50-64"
	 * if grade is D, print "score is between 40-49"
	 * if grade is F, print "score is between 0-39"
	 */
	public static void displayScore(Grade g) {
		if (g.equals(Grade.A)) {
			System.out.println("score is between 90-100");
		} else if (g.equals(Grade.B)) {
			System.out.println("score is between 65-89");
		} else if (g.equals(Grade.C)) {
			System.out.println("score is between 50-64");
		} else if (g.equals(Grade.D)) {
			System.out.println("score is between 40-49");
		} else if (g.equals(Grade.F)) {
			System.out.println("score is between 0-39");
		}
	}
	
	public static void displayScore2(Grade grade) {
		switch (grade) {
		case A:
			System.out.println("score is between 90-100");
			break;
		case B:
			System.out.println("score is between 65-89");
			break;
		case C:
			System.out.println("score is between 50-64");
			break;
		case D:	
			System.out.println("score is between 40-49");
			break;
		case F:
			System.out.println("score is between 0-39");
			break;
		default:
			System.out.println("Invalid value");
		}
	}
	
}





