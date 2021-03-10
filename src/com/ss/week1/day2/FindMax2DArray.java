/**
 * 
 */
package com.ss.week1.day2;

/**
 * @author marvin
 *
 */
public class FindMax2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Generate 2D Array
		Integer rows = 5, cols = 5;
		Integer[][] array = new Integer[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = (int)(Math.random() * 100);
			}
		}

		// Display Array
		StringBuilder displayArray = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				displayArray.append(array[i][j]);
				displayArray.append("\t| ");
			}
			displayArray.append("\n");
		}
		System.out.println(displayArray);
		
		// Find Max Number
		Integer maxNum = null;
		Integer maxRow = null;
		Integer maxCol = null;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (maxNum == null || array[i][j] > maxNum) {
					maxNum = array[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		System.out.println("Max: " + maxNum);
		System.out.println("Position: " + maxRow + "," + maxCol);
	}

}