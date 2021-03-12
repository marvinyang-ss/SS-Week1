package com.ss.week1.day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeadlockDemoTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			DeadlockDemo.main(null);
		});
	}

}
