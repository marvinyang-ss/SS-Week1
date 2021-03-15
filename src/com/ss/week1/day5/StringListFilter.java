/**
 * 
 */
package com.ss.week1.day5;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author marvin
 *
 */
public class StringListFilter {
	public List<String> filterLetterALength3(List<String> list) {
		List<String> result = list.stream()
				.filter(s -> s.charAt(0) == 'a' && s.length() == 3)
				.collect(Collectors.toList());
		
		return result;
	}
}
