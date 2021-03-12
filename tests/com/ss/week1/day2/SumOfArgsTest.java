package com.ss.week1.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.week1.day3.WriteFile;

class SumOfArgsTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			SumOfArgs.main(new String[]{"5 2 10"});
		});
		assertDoesNotThrow(() -> {
			SumOfArgs.main(new String[]{"not a number"});
		});
		assertDoesNotThrow(() -> {
			SumOfArgs.main(new String[]{});
		});
	}

}
