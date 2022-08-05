package day48;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Today {
	public static void main(String[] args) {
		// LocalDate
		// LocalTime
		
		// get todays date and time
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// from date to string with different format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YY HH:mm a");
		String dateStr = formatter.format(now);
		System.out.println(dateStr);
		
		// from string to date by using custom format
		String str = "03/26/1996";
		DateTimeFormatter parseFormatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		LocalDate date = LocalDate.parse(str, parseFormatter);
		System.out.println(date);
	}
}
