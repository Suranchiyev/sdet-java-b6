package day20;

public class DayOfWeek {
	enum Day {
		MON, TUE, WED, THUR, FRI, SAT, SUN
	}
	
	public static void main(String[] args) {
		myWeek(Day.WED);
		myWeek(Day.SUN);
		myWeek(Day.MON);
	}
	
	/*
	 * Based on the day, print the msg
	 * Mon - Homework day
	 * Tue - Study day
	 * Wed - Chill day
	 * Thur - Study day
	 * Fri - Coding day
	 * Sat - Java epic day
	 * Sun - Java epic day
	 */
	public static void myWeek(Day myDay) {
		if (myDay.equals(Day.MON)) {
			System.out.println("Homework day");
			
		} else if (myDay.equals(Day.TUE) || myDay.equals(Day.THUR)) {
			System.out.println("Study day");
			
		} else if (myDay.equals(Day.WED)) {
			System.out.println("Chill day");
			
		} else if (myDay.equals(Day.FRI)) {
			System.out.println("Coding day");
			
		} else if (myDay.equals(Day.SAT) || myDay.equals(Day.SUN)) {
			System.out.println("Java epic day");
		}
	}
}
