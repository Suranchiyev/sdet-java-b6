package day49;

import java.io.File;
import java.io.IOException;

public class FilePracticeTwo {
	public static void main(String[] args) {
		// File class can create file or directory
		// File class can delete file or directory
		File myFile = new File("src/day49/myExceptionNotes.txt");
		System.out.println(myFile.exists());
		
		try {
			if (!myFile.exists()) {
				System.out.println("Create new file");
				myFile.createNewFile();
			} else {
				System.out.println("Already exist");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}	
