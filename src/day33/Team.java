package day33;

import java.util.Arrays;

public class Team {
	public static void main(String[] args) {
		String[][] teams = 
				{
						{"Yulduz", "Mark", "Akylbek", "Daniel"},
						{"Ariunna", "Frank", "Nurgazy", "Anna"},
						{"Selvin", "Meerim", "Gulzhana", "Rocio"},
						{"Job", "Evelyn", "Edil", "Aizhamal"},
						{"", "", "", ""}
				};
		
		System.out.println(Arrays.deepToString(teams));
		System.out.println(teams[1][1]); // Frank
	}
}
