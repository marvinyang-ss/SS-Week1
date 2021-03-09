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
			pp.printCharLine('*', i+1);
		}
		pp.printCharLine('.', 9);
		System.out.println();
		
		// Pattern 2
		System.out.println("2)");
		pp.printCharLine('.', 10);
		for (int i = 0; i < 4; i++) {
			pp.printCharLine('*', 4-i);
		}
		System.out.println();
		
		// Pattern 3
		System.out.println("3)");
		for (int i = 0; i < 4; i++) {
			pp.printChar(' ', 5-i);
			pp.printCharLine('*', 1+(i*2));
		}
		pp.printCharLine('.', 11);
		System.out.println();
		
		// Pattern 4
		System.out.println("4)");
		pp.printCharLine('.', 12);
		for (int i = 0; i < 4; i++) {
			pp.printChar(' ', 2+i);
			pp.printCharLine('*', 7-(i*2));
		}
	}
	
	/**
	 * Print a line of characters
	 * @param c
	 * @param n
	 */
	private void printChar(char c, int n) {
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
	private void printCharLine(char c, int n) {
		printChar(c, n);
		System.out.println();
	}

}
