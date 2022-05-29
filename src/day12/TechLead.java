package day12;

public class TechLead {
	public static void main(String[] args) {
		techLead(1); // 1
		techLead(3); // Tech
		techLead(4); // 4
		techLead(5); // Lead
		techLead(6); // Tech
		techLead(7); // 7
		techLead(15); // TechLead
	}
	
	/*
	 * if number is divisible evenly by 3 then print "Tech"
	 * if number is divisible evenly by 5 then print "Lead"
	 * if number is divisible evenly by 3 and 5 then print "TechLead"
	 * otherwise print number itself
	 */
	public static void techLead(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("TechLead");
			
		} else if (number % 3 == 0) {
			System.out.println("Tech");
			
		} else if (number % 5 == 0) {
			System.out.println("Lead");
	
		} else {
			System.out.println(number);
		}
	}
}






