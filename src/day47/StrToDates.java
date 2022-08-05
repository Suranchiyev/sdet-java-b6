package day47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StrToDates {
	public static void main(String[] args) {
		String str = "Date created: 2023-02-08";
		str = str.split(":")[1].trim();
		System.out.println(str); // 2023-02-08
		
		LocalDate dateFromWebsite = LocalDate.parse(str);
		LocalDate today = LocalDate.now();
		
		if (dateFromWebsite.isBefore(today)) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case failed");
		}
		
		System.out.println("---------");
		
		String deleteText = "Deleted date is 08/02/2022";
		String[] parts = deleteText.split(" ");
		String strDate = parts[parts.length - 1];
		System.out.println(strDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		LocalDate deletedDate = LocalDate.parse(strDate, formatter);
		System.out.println(deletedDate);
		
		if (deletedDate.isEqual(today)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case failed");
		}
		// BREAK TILL 9:20PM EST
	}
}
