package com.ss.week1.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringListFilterTest {

	@Test
	void filterLetterALength3Test() {
		StringListFilter filter = new StringListFilter();
		
		List<String> list = Arrays.asList("it", "was", "all", "an", 
				"act", "to", "try", "and", "make", "him", "talk");
		
		List<String> filteredList = filter.filterLetterALength3(list);
		
		assertEquals(3, filteredList.size());
		assertEquals("all", filteredList.get(0));
		assertEquals("act", filteredList.get(1));
		assertEquals("and", filteredList.get(2));
	}

}
