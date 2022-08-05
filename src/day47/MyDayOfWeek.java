package day47;

import java.time.LocalDate;
import java.time.Month;

public class MyDayOfWeek {
	public static void main(String[] args) {
		// TODO find out your birthday day of week and send to general the Day.
		LocalDate birthday = LocalDate.of(3000, Month.AUGUST, 1);
		System.out.println(birthday.getDayOfWeek());
	}
}
