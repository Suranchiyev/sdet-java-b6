package day49;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("src/day49/notes.txt");
		System.out.println(file.exists());
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			br.lines().forEach(line -> {
				System.out.println(line + " - " + (Integer.parseInt(line.trim()) % 2 == 0));
			});
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Exception is handled: "  + e.getMessage());
			
		} finally {
			try {
				System.out.println("Closing file");
				br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
