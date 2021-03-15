package com.ss.week1.assignments;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FunctionalTest {
	
	Functional func;

	@BeforeEach
	void setUp() throws Exception {
		func = new Functional();
	}

	@Test
	void rightDigitTest() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(22);
		numbers.add(93);
		List<Integer> result = func.rightDigit(numbers);
		assertEquals(3, result.size());
		assertEquals(1, result.get(0));
		assertEquals(2, result.get(1));
		assertEquals(3, result.get(2));

		numbers = new ArrayList<>();
		numbers.add(16);
		numbers.add(8);
		numbers.add(886);
		numbers.add(8);
		numbers.add(1);
		result = func.rightDigit(numbers);
		assertEquals(5, result.size());
		assertEquals(6, result.get(0));
		assertEquals(8, result.get(1));
		assertEquals(6, result.get(2));
		assertEquals(8, result.get(3));
		assertEquals(1, result.get(4));

		numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(0);
		result = func.rightDigit(numbers);
		assertEquals(2, result.size());
		assertEquals(0, result.get(0));
		assertEquals(0, result.get(1));
	}

	@Test
	void doublingTest() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Integer> result = func.doubling(numbers);
		assertEquals(3, result.size());
		assertEquals(2, result.get(0));
		assertEquals(4, result.get(1));
		assertEquals(6, result.get(2));

		numbers = new ArrayList<>();
		numbers.add(6);
		numbers.add(8);
		numbers.add(6);
		numbers.add(8);
		numbers.add(-1);
		result = func.doubling(numbers);
		assertEquals(5, result.size());
		assertEquals(12, result.get(0));
		assertEquals(16, result.get(1));
		assertEquals(12, result.get(2));
		assertEquals(16, result.get(3));
		assertEquals(-2, result.get(4));

		numbers = new ArrayList<>();
		result = func.doubling(numbers);
		assertEquals(0, result.size());
	}

	@Test
	void noXTest() {
		List<String> strings = new ArrayList<>();
		strings.add("ax");
		strings.add("bb");
		strings.add("cx");
		List<String> result = func.noX(strings);
		assertEquals(3, result.size());
		assertEquals("a", result.get(0));
		assertEquals("bb", result.get(1));
		assertEquals("c", result.get(2));

		strings = new ArrayList<>();
		strings.add("xxax");
		strings.add("xbxbx");
		strings.add("xxcx");
		result = func.noX(strings);
		assertEquals(3, result.size());
		assertEquals("a", result.get(0));
		assertEquals("bb", result.get(1));
		assertEquals("c", result.get(2));

		strings = new ArrayList<>();
		strings.add("x");
		result = func.noX(strings);
		assertEquals(1, result.size());
		assertEquals("", result.get(0));
	}

}
