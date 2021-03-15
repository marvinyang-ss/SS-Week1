/**
 * 
 */
package com.ss.week1.assignments;

/**
 * @author marvin
 *
 */
public class Operations {

	public PerformOperation isOdd() {
		return num -> num % 2 == 1;
	}
	
	public PerformOperation isPrime() {
		return num -> {
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		};
	}
	
	public PerformOperation isPalindrome() {
		return num -> {
			String numString = ""+num;
			StringBuffer reverseString = new StringBuffer().append(numString).reverse();
			return numString.equals(reverseString.toString());
		};
	}
	
}
