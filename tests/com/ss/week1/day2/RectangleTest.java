package com.ss.week1.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	@Test
	void calculateAreaTest() {
		Rectangle r = new Rectangle(5, 10);
		assertEquals(50.0, r.calculateArea(), 0.0001);
	}

}
