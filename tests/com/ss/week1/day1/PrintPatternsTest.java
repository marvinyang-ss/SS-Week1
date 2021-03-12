package com.ss.week1.day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.week1.day3.WriteFile;

class PrintPatternsTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			PrintPatterns.main(new String[]{});
		});
	}

}
