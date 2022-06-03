package day14;

import util.InputFromUser;

public class DayOfWeek {
	public static void main(String[] args) {
		String strNumber = InputFromUser.getInput("Enter number within 0-6(int):");
		int dayOfWeek = Integer.parseInt(strNumber);
		System.out.println(dayOfWeek);
		
		/*
		 * 0 - Sun
		 * 1 - Mon 
		 * 2 - Tue 
		 * 3 - Wed 
		 * 4 - Thur 
		 * 5 - Fri 
		 * 6 - Sat
		 * For any other numbers, print "invalid input"
		 */
		
		/*
		if (dayOfWeek == 0) {
			System.out.println("Sun");
		} else if (dayOfWeek == 1) {
			System.out.println("Mon");
		} else if (dayOfWeek == 2) {
			System.out.println("Tue");
		} else if (dayOfWeek == 3) {
			System.out.println("Wed");
		} else if (dayOfWeek == 4) {
			System.out.println("Thur");
		} else if (dayOfWeek == 5) {
			System.out.println("Fri");
		} else if (dayOfWeek == 6) {
			System.out.println("Sat");
		} else {
			System.out.println("invalid input");
		}
		*/
		
		//         11
		switch (dayOfWeek) {
			case 0:
				System.out.println("Sun");
				break;
			case 1:
				System.out.println("Mon");
				break;
			case 2:
				System.out.println("Tue");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4: 
				System.out.println("Thur");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			default:
				System.out.println("invalid input");
		}
	}
}









