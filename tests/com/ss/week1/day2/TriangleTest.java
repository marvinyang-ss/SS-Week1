package com.ss.week1.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void calculateAreaTest() {
		Triangle t = new Triangle(5, 10);
		assertEquals(25.0, t.calculateArea(), 0.0001);
	}

}
