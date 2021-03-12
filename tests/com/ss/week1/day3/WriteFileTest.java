package com.ss.week1.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WriteFileTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			WriteFile.main(new String[]{"src/com/ss/week1/day3/Notes.txt"});
		});
		assertDoesNotThrow(() -> {
			WriteFile.main(new String[]{});
		});
	}

}
