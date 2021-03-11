/**
 * 
 */
package com.ss.week1.day3;

import java.io.File;
import java.util.Scanner;

/**
 * @author marvin
 *
 */
public class FileHandler {
	
	public File requestFile(Scanner scanner) {
		File file = null;

		while (file == null || !file.isFile()) {
			if (file != null)
				System.out.println("Path is invalid or not a file!");
			System.out.print("Enter a file path: ");
			file = new File(scanner.nextLine());
		}
		
		return file;
	}
	
	public File requestDirectory(Scanner scanner) {
		File directory = null;

		while (directory == null || !directory.isDirectory()) {
			if (directory != null)
				System.out.println("Path is invalid or not a directory!");
			System.out.print("Enter a directory path: ");
			directory = new File(scanner.nextLine());
		}
		
		return directory;
	}

}
