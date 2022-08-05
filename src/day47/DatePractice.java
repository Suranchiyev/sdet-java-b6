package day47;

import java.time.LocalDate;
import java.time.Month;

public class DatePractice {
	public static void main(String[] args) {
		// LocalDate
		
		// current date
		LocalDate today = LocalDate.now();
		System.out.println("Current date: " + today); // 2022-08-02
		
		LocalDate birthday = LocalDate.of(2006, Month.APRIL, 20);
		System.out.println("Birthday: " + birthday);
		
		System.out.println("Day of week: " + birthday.getDayOfWeek());
		System.out.println("Is leap year : " + birthday.isLeapYear());
		
		birthday = birthday.plusYears(10);
		birthday = birthday.plusMonths(10);
		birthday = birthday.plusDays(11);
		System.out.println("Birthday: " + birthday);
		System.out.println("Day of week: " + birthday.getDayOfWeek());
		
		if (today.isAfter(birthday)) {
			System.out.println("Yes, today is after " + birthday);
		}
		// BREAK TILL 8:20PM EST
	}
}
