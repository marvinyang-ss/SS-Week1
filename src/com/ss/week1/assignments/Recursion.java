/**
 * 
 */
package com.ss.week1.assignments;

/**
 * @author marvin
 *
 */
public class Recursion {
	
	public Boolean groupSumClump(Integer currentIndex, Integer[] numbers, Integer target) {
		if (currentIndex >= numbers.length) {
			return target == 0;
		} else {
			int sum = 0;
			int i;
			for (i = currentIndex; i < numbers.length; i++) {
				if (numbers[i] != numbers[currentIndex]) {
					break;
				}
				sum += numbers[i];
			}
			
			return groupSumClump(i, numbers, target-sum) || groupSumClump(i, numbers, target);
		}
	}

}
