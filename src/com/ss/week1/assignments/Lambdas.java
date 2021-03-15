/**
 * 
 */
package com.ss.week1.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author marvin
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer numTestCases = null;
		Integer[][] input = null;
		Operations ops = new Operations();
		File file = new File("src/com/ss/week1/Assignments/Input");
		
		// Read input file
		try (FileReader reader = new FileReader(file)) {
			int data;
			int i = 0;
			StringBuilder number = new StringBuilder();
			while ((data = reader.read()) != -1) {
				char c = (char)data;
				if (c == '\n') {
					if (numTestCases == null) {
						numTestCases = Integer.parseInt(number.toString());
						input = new Integer[numTestCases][2];
						number.setLength(0);
					} else {
						input[i][1] = Integer.parseInt(number.toString());
						i++;
						number.setLength(0);
					}
				} else if (c == ' ') {
					input[i][0] = Integer.parseInt(number.toString());
					number.setLength(0);
				} else {
					number.append(c);
				}
			}
			input[i][1] = Integer.parseInt(number.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Run operations
		for (int i = 0; i < numTestCases; i++) {
			switch (input[i][0]) {
			case 1:
				System.out.println(ops.isOdd().run(input[i][1]) ? "ODD" : "EVEN");
				break;
			case 2:
				System.out.println(ops.isPrime().run(input[i][1]) ? "PRIME" : "COMPOSITE");
				break;
			case 3:
				System.out.println(ops.isPalindrome().run(input[i][1]) ? "PALINDROME" : "NOT PALINDROME");
				break;
			}
		}
		
	}

}
