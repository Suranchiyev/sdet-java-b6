package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterPractice {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM/dd/YYYY");
		String formattedDate = f.format(today);
		System.out.println(formattedDate);
		
		f = DateTimeFormatter.ofPattern("MMMM dd YY");
		formattedDate = f.format(today);
		System.out.println(formattedDate);
	}
}
