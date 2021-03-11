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
public class ListFilesInDirectory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		File directory = null;
		
		// Get directory
		if (args.length == 0 || !(directory = new File(args[0])).isDirectory()) {
			FileHandler fh = new FileHandler();
			directory = fh.requestDirectory(scanner);
		}
		
		// Print files
		File[] files = directory.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
		
	}

}
