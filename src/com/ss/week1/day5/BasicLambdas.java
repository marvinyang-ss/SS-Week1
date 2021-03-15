/**
 * 
 */
package com.ss.week1.day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author marvin
 *
 */
public class BasicLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicLambdas bl = new BasicLambdas();
		String[] names = {"Mary", "Bob", "John", "Ezekiel", "Tom", "Ethan", "Sam", "George", "Sarah", "Greg"};
		
		Map<Comparator<String>, String> comparatorsMap = new LinkedHashMap<>();
		
		// Compare by length
		comparatorsMap.put(
			(s1, s2) -> s1.length() - s2.length(),
			"length"
		);
		
		// Compare by reverse length
		comparatorsMap.put(
			(s1, s2) -> s2.length() - s1.length(),
			"reverse length"
		);
		
		// Compare by first letter
		comparatorsMap.put(
			(s1, s2) -> s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0),
			"first letter"
		);
		
		// Compare by letter 'e'
		comparatorsMap.put(
			(s1, s2) -> {
				if (s1.toLowerCase().charAt(0) == 'e' && s2.toLowerCase().charAt(0) == 'e') {
					return 0;
				} else if (s1.toLowerCase().charAt(0) == 'e') {
					return -1;
				} else if (s2.toLowerCase().charAt(0) == 'e') {
					return 1;
				} else {
					return 0;
				}
			}, "letter 'e'"
		);
		
		// Compare by letter 'e' using static helper method
		comparatorsMap.put(
			(s1, s2) -> BasicLambdas.compareByLetterE(s1, s2),
			"letter 'e' using static helper method"
		);
		
		// Sort and print
		comparatorsMap.forEach((c, cName) -> {
			Arrays.sort(names, c);
			System.out.println("Sort by " + cName + ":");
			for (String n : names) {
				System.out.println(n);
			}
			System.out.println();
		});
	}
	
	/**
	 * Compares two strings by checking if the first letter is 'e'
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static int compareByLetterE(String s1, String s2) {
		if (s1.toLowerCase().charAt(0) == 'e' && s2.toLowerCase().charAt(0) == 'e') {
			return 0;
		} else if (s1.toLowerCase().charAt(0) == 'e') {
			return -1;
		} else if (s2.toLowerCase().charAt(0) == 'e') {
			return 1;
		} else {
			return 0;
		}
	}

}
