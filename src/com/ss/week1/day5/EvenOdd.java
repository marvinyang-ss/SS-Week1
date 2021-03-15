/**
 * 
 */
package com.ss.week1.day5;

import java.util.LinkedList;
import java.util.List;

/**
 * @author marvin
 *
 */
public class EvenOdd {
	public String labelEvenOrOdd(List<Integer> list) {
		StringBuilder result = new StringBuilder();
		
		list.stream().forEachOrdered(i -> {
			if (i % 2 == 0) {
				result.append("e" + i + ",");
			} else {
				result.append("o" + i + ",");
			}
		});
		result.deleteCharAt(result.lastIndexOf(","));
		
		return result.toString();
	}
}