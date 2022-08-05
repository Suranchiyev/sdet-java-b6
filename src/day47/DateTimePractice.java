package day47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePractice {
	public static void main(String[] args) {
		// LocalDate => dates
		// LocalTime => time
		// LocalDateTime => date + time
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime myDay = LocalDateTime.of(2022, 8, 1, 9, 00);
		System.out.println(myDay);
		System.out.println(myDay.getMonth());
		System.out.println(myDay.getDayOfWeek());
		System.out.println(myDay.getHour());
		System.out.println(myDay.getMinute());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd YYYY - hh:mm:ss a");
		String strDateTime = formatter.format(myDay);
		System.out.println(strDateTime);
	}
}
