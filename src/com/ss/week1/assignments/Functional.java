/**
 * 
 */
package com.ss.week1.assignments;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author marvin
 *
 */
public class Functional {
	
	public List<Integer> rightDigit(List<Integer> numbers) {
		return numbers.stream().map(num -> {
			String numString = num.toString();
			Character lastDigit = numString.charAt(numString.length()-1);
			return Integer.parseInt(lastDigit.toString());
		}).collect(Collectors.toList());
	}
	
	public List<Integer> doubling(List<Integer> numbers) {
		return numbers.stream().map(num -> num*2).collect(Collectors.toList());
	}
	
	public List<String> noX(List<String> strings) {
		return strings.stream().map(s -> {
			StringBuilder result = new StringBuilder();
			for (String letter : s.split("")) {
				if (!letter.equals("x")) {
					result.append(letter);
				}
			}
			return result.toString();
		}).collect(Collectors.toList());
	}
	
}
