package day35;

import java.util.ArrayList;

public class DaysOfWeek {
	public static void main(String[] args) {
		// TODO Create ArrayList of String
		// add these values: 
		// [Mon, Tue, Wed, Thur, Fri, Sat, Sun]
		
		// print list from last element to first in new line
		
		ArrayList<String> daysOfWeek = new ArrayList<>();
		daysOfWeek.add("Mon");
		daysOfWeek.add("Tue");
		daysOfWeek.add("Wed");
		daysOfWeek.add("Thur");
		daysOfWeek.add("Fri");
		daysOfWeek.add("Sat");
		daysOfWeek.add("Sun");
		System.out.println(daysOfWeek);
		
		for (int i = daysOfWeek.size() - 1; i >= 0; i--) {
			System.out.println(daysOfWeek.get(i));
		}
		
		// Naming common practices:
		// variables and methods - the name starts with lower case and we follow with camel cases
		// ex: firstName, daysOfWeek
		
		// class, interface, enums, annotations - the name starts with upper case and we follow camel cases
		// ex: Student, DaysOfWeek
		
		// package - the name starts with lower case and goes with camel cases
		// projects - usually starts lower case and separation by -
	}
}
