package day5;

public class EggBasket {
	public static void main(String[] args) {
		int numberOfBaskets;
		int eggsPerBasket;
		int totalEggs;
		
		numberOfBaskets = 10;
		eggsPerBasket = 6;
		//  60    =              10 * 6
		totalEggs = numberOfBaskets * eggsPerBasket;
		
		System.out.println("if you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("the total number of egss is " + totalEggs);
		
		// The output of concatenation with string of any data type will result a string
	}
}
