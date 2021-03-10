/**
 * 
 */
package com.ss.week1.day1;

/**
 * @author marvin
 *
 */
public class PrintPatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintPatterns pp = new PrintPatterns();
		
		// Pattern 1
		System.out.println("1)");
		for (int i = 0; i < 4; i++) {
			pp.printRepeatLine("*", i+1);
		}
		pp.printRepeatLine(".", 9);
		System.out.println();
		
		// Pattern 2
		System.out.println("2)");
		pp.printRepeatLine(".", 10);
		for (int i = 0; i < 4; i++) {
			pp.printRepeatLine("*", 4-i);
		}
		System.out.println();
		
		// Pattern 3
		System.out.println("3)");
		for (int i = 0; i < 4; i++) {
			pp.printRepeat(" ", 5-i);
			pp.printRepeatLine("*", 1+(i*2));
		}
		pp.printRepeatLine(".", 11);
		System.out.println();
		
		// Pattern 4
		System.out.println("4)");
		pp.printRepeatLine(".", 12);
		for (int i = 0; i < 4; i++) {
			pp.printRepeat(" ", 2+i);
			pp.printRepeatLine("*", 7-(i*2));
		}
	}
	
	/**
	 * Print a line of characters
	 * @param c
	 * @param n
	 */
	public void printRepeat(String c, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
	}
	
	/**
	 * Print a line of characters and a new line
	 * @param c
	 * @param n
	 * @param newLine
	 */
	public void printRepeatLine(String c, int n) {
		printRepeat(c, n);
		System.out.println();
	}

}
