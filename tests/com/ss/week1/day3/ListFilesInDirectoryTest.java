package com.ss.week1.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.week1.day4.DeadlockDemo;

class ListFilesInDirectoryTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			ListFilesInDirectory.main(new String[]{"src/com/ss/week1/day3/"});
		});
		assertDoesNotThrow(() -> {
			ListFilesInDirectory.main(new String[]{});
		});
	}

}
