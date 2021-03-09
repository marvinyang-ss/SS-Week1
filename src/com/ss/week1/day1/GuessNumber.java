/**
 * 
 */
package com.ss.week1.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author marvin
 *
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = (int)(Math.random() * 100 + 1);
		int numberOfTries = 5;
		boolean guessedCorrect = false;
		
		for (int i = 0; i < numberOfTries; i++) {
			// ask user to guess a number
			System.out.print("Guess a number (1-100):");
			int guess;
			try {
				guess = scanner.nextInt();
			} catch(InputMismatchException ime) {
				System.out.println("Please input a number!");
				i--;
				scanner.next();
				continue;
			}
			
			// check if guess is correct
			if (Math.abs(guess - number) <= 10) {
				guessedCorrect = true;
				if (guess == number) {
					System.out.println("Correct!");
				} else {
					System.out.println("Eh, close enough");
				}
				break;
			}
			
			if (i < numberOfTries-1) {
				System.out.println("Wrong. Keep Trying!");
			}
		}
		
		if (!guessedCorrect) {
			System.out.println("Sorry");
		}
		System.out.println("The number is " + number);
	}

}
