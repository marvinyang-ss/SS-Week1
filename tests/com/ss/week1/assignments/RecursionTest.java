package com.ss.week1.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionTest {

	@Test
	void groupSumClumpTest() {
		Recursion rec = new Recursion();
		
		Integer[] array = new Integer[]{2,4,8};
		assertTrue(rec.groupSumClump(0, array, 10));
		
		array = new Integer[]{1,2,4,8,1};
		assertTrue(rec.groupSumClump(0, array, 14));
		
		array = new Integer[]{2,4,4,8};
		assertFalse(rec.groupSumClump(0, array, 14));
	}

}
