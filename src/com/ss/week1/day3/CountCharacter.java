/**
 * 
 */
package com.ss.week1.day3;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author marvin
 *
 */
public class CountCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		File file = null;
		Character targetChar = null;
		Integer count = 0;
		
		// Get file at args[0] or ask user
		if (args.length == 0 || !(file = new File(args[0])).isFile()) {
			FileHandler fh = new FileHandler();
			file = fh.requestFile(scanner);
		}
		
		// Get target character at args[1] or ask user
		if (args.length >= 2) {
			targetChar = args[1].charAt(0);
		} else {
			System.out.print("Enter a character: ");
			targetChar = scanner.nextLine().charAt(0);
		}
		
		// Read file
		try (FileReader reader = new FileReader(file)) {
			Integer data;
			while ((data = reader.read()) != -1) {
				Character currentChar = (char)data.intValue();
				if (currentChar == targetChar) {
					count++;
				}
			}
			System.out.println("The character '" + targetChar + "' appears " + count + " times");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
