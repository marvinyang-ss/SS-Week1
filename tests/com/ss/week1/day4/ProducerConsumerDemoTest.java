package com.ss.week1.day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProducerConsumerDemoTest {

	@Test
	void mainTest() {
		assertDoesNotThrow(() -> {
			ProducerConsumerDemo.main(null);
		});
	}

}
