package day12;

public class Account {
	public static void main(String[] args) {
		int savings = 50000;
		int salary = 100000;
		int expenses = 70000;
		
		myFinanceMsg(savings, salary, expenses); // Good! Still Alive!
		myFinanceMsg(80000, 60000, 70000); // Good! Still Alive!
		myFinanceMsg(40000, 60000, 65000); // Bankrupt
	}
	
	/*
	 * if salary more than expenses or savings more than expenses
	 * then method prints "Good! Still Alive!"
	 * otherwise it prints "Bankrupt"
	 */
	public static void myFinanceMsg(int savings, int salary, int expenses) { 
		if (salary > expenses || savings > expenses) {
			System.out.println("Good! Still Alive!");
			
		} else {
			System.out.println("Bankrupt");
			
		}
	}
}
