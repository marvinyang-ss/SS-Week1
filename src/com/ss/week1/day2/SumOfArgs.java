/**
 * 
 */
package com.ss.week1.day2;

/**
 * @author marvin
 *
 */
public class SumOfArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Double sum = 0.0;

		System.out.print("args: [ ");
		try {
			for (String item : args) {
				System.out.print(item + " ");
				Double num = Double.parseDouble(item);
				sum += num;
			}
			System.out.println("]");
			System.out.println("Sum = " + sum);
		} catch (NumberFormatException nfe) {
			System.out.println("]");
			System.out.println("Please input only numbers!");
		}
	}

}
