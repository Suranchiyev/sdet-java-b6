package day49;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FilePractice {
	public static void main(String[] args) {
		// File class represent files and folder in java
		// File class can read meta data(data about data)
		// File class can create/delete files or folders
		
		// absolute path - path to the file from root directory
		// File myFile = new File("/Users/beknazarsuranchiyev/Desktop/Questions.txt");
		
		// relative path - path to the file from the place where code is running
		File myFile = new File("src/day49/notes.txt");
		// File myDir = new File("src/day49");
		
		System.out.println(myFile.exists());
		System.out.println(myFile.getName());
		System.out.println("IS FILE: " + myFile.isFile());
		System.out.println("IS DIR: " + myFile.isDirectory());
		
		System.out.println("Size in bytes: " + myFile.length());
		
		// number of seconds 1656162263480 from 00:00:00 UTC on 1 January 1970
		// epoch date
		System.out.println("Last modified: " + myFile.lastModified());
		LocalDateTime ldt = Instant.ofEpochMilli(myFile.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt);		
	}
}
