package day8;

import util.InputFromUser;

public class EggBasket {
	public static void main(String[] args) {
		long numberOfBaskets, eggsPerBasket, totalEggs;
		// TODO get these two values from the user(console)
	
		// String nBaskestStr = InputFromUser.getInput("How many baskets(numeric)?");
		// String eggsPerBasketStr = InputFromUser.getInput("How many eggs per basket(numeric)?");
		// numberOfBaskets = Long.parseLong(nBaskestStr);
		// eggsPerBasket = Long.parseLong(eggsPerBasketStr);
		
		numberOfBaskets = Long.parseLong(InputFromUser.getInput("How many baskets(numeric)?"));
		eggsPerBasket = Long.parseLong(InputFromUser.getInput("How many eggs per basket(numeric)?"));
		
		totalEggs = numberOfBaskets * eggsPerBasket;
		System.out.println("if you have");
		System.out.println(eggsPerBasket + " eggs per basket and");
		System.out.println(numberOfBaskets + " baskets, then");
		System.out.println("the total number of eggs is " + totalEggs);
	}
}
