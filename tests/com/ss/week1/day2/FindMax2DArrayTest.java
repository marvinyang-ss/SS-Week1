package com.ss.week1.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.week1.day3.WriteFile;

class FindMax2DArrayTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			FindMax2DArray.main(new String[]{});
		});
	}

}
