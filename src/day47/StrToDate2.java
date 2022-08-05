package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// TODO 
// MMMM
// uuuu
// Verify the date in str is 03/08/2022
// for success print "Test case pass"
// otherwise print "Test case failed"
public class StrToDate2 {
	public static void main(String[] args) {
		String str = "Today is March 8, 2022";
		str = str.substring(9);
		
		System.out.println(str); // March 8, 2022
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, uuuu");
		
		LocalDate actualDate = LocalDate.parse(str, formatter);
		LocalDate expectedDate = LocalDate.of(2022, 3, 8);
		
		if (expectedDate.isEqual(actualDate)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case failed");
		}
	}
}
