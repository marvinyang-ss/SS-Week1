package com.ss.week1.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	
	private Operations ops;

	@BeforeEach
	void setUp() throws Exception {
		ops = new Operations();
	}

	@Test
	void isOddTest() {
		assertTrue(ops.isOdd().run(5));
		assertFalse(ops.isOdd().run(2));
	}

	@Test
	void isPrimeTest() {
		assertTrue(ops.isPrime().run(11));
		assertFalse(ops.isPrime().run(15));
	}

	@Test
	void isPalindromeTest() {
		assertTrue(ops.isPalindrome().run(5));
		assertTrue(ops.isPalindrome().run(22));
		assertTrue(ops.isPalindrome().run(262));
		assertFalse(ops.isPalindrome().run(36));
	}

}
