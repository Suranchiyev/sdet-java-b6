package day20;

public class MovieRating {	
	
	public static void main(String[] args) {
		// TODO
		// 1. Refactor this code by using Enum:
		//    - create enum with correct values 
		//    - change getRatingMsg method to use enum
		//    - switch
		// 2. Put some test case in the main method
		//    - use method in the main method with enum
		
		String res = getRatingMsg(Rating.EXCELLENT);
		System.out.println(res);
		
		System.out.println(getRatingMsg(Rating.AVERAGE));
		System.out.println(getRatingMsg(Rating.BAD));
	}
	
	/*
	 * Rating: EXCELLENT, AVERAGE, BAD
	 * EXCELLENT -> You must see this movie!
	 * AVERAGE -> This movie is OK, but not great!
	 * BAD -> Skip it
	 */
	public static String getRatingMsg(Rating rating) {
		switch(rating) {
		case EXCELLENT:
			return "You must see this movie!";
		case AVERAGE:
			return "This movie is OK, but not great!";
		case BAD:
			return "Skip it";
		default:
			return "Invalid rating";
		}
	}
}
