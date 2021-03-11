/**
 * 
 */
package com.ss.week1.day3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author marvin
 *
 */
public class WriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		File file = null;
		
		// Get file
		if (args.length == 0 || !(file = new File(args[0])).isFile()) {
			FileHandler fh = new FileHandler();
			file = fh.requestFile(scanner);
		}
		
		// Write file
		try (FileWriter writer = new FileWriter(file, true)) {
			System.out.println("Append text to file:");
			writer.append(scanner.nextLine());
			System.out.println("Success!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
