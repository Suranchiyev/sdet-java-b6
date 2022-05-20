package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser {
	public static String getInput(String message) {
		try {
			BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(message);
			return bReader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String getInput() {
		try {
			BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
			return bReader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
