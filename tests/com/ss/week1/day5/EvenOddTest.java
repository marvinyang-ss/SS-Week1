package com.ss.week1.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EvenOddTest {

	@Test
	void labelEvenOrOddTest() {
		EvenOdd eo = new EvenOdd();
		List<Integer> integers = new LinkedList<>();
		integers.add(6);
		integers.add(11);
		integers.add(0);
		integers.add(-4);
		integers.add(-5);
		
		assertEquals("e6,o11,e0,e-4,o-5", eo.labelEvenOrOdd(integers));
	}

}
