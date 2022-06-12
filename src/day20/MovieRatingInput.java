package day20;

import util.InputFromUser;

public class MovieRatingInput {
	
	public static void main(String[] args) {
		System.out.println("Available ratings: EXCELLENT, AVERAGE, BAD");
		String ratingInputStr = InputFromUser.getInput("Enter rating:");
		
		// Rating.valueOf(ratingInputStr); converts String value to enum
		Rating rating = Rating.valueOf(ratingInputStr);
		System.out.println(getRatingMsg(rating));
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
