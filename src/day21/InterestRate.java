package day21;

import util.InputFromUser;

public class InterestRate {
	public static final double APR = 0.10;
	public static final double MONTHLY_INTEREST_RATE = APR / 12;

	public static void main(String[] args) {
		String balanceStr = InputFromUser.getInput("Enter balance(double):");
		String monthsStr = InputFromUser.getInput("Enter for how many months:");
				
		double balance = Double.parseDouble(balanceStr);
		double intialBalance = balance;
		int months = Integer.parseInt(monthsStr);
		
		int count = 0;
		while (months > count) {
			double monthlyProfit = balance * (MONTHLY_INTEREST_RATE / 100);
			balance = balance + monthlyProfit;
			count++;
		}
		balance = Math.round(balance);
		
		System.out.println("Total balance: " + balance);
		System.out.println("Initial balance: " + intialBalance);
		System.out.println("Interest earned: " + (balance - intialBalance));
		System.out.println("Months: " + months);
	}
}
