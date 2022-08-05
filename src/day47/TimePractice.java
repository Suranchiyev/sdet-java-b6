package day47;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePractice {
	public static void main(String[] args) {
		// LocalTime
		
		LocalTime now = LocalTime.now();
		System.out.println("Time: " + now);
		
		now = now.plusHours(1);
		System.out.println(now);
		
		now = now.plusSeconds(10000);
		System.out.println(now); // 00:19:23.749459
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		String timeStr = formatter.format(now);
		System.out.println(timeStr);
		
		now = now.plusHours(15);
		formatter = DateTimeFormatter.ofPattern("hh:mm a");
		timeStr = formatter.format(now);
		System.out.println(timeStr);
	}
}
