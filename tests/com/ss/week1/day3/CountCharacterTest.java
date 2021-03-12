package com.ss.week1.day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ss.week1.day4.DeadlockDemo;

class CountCharacterTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			CountCharacter.main(new String[]{});
		});
		assertDoesNotThrow(() -> {
			CountCharacter.main(new String[]{"src/com/ss/week1/day3/Notes.txt", "e"});
		});
		assertDoesNotThrow(() -> {
			CountCharacter.main(new String[]{"src/com/ss/week1/day3/Notes.txt"});
		});
		assertDoesNotThrow(() -> {
			CountCharacter.main(new String[]{"nonexistingfile"});
		});
	}

}
