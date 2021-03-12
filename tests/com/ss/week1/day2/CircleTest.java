package com.ss.week1.day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void calculateAreaTest() {
		Circle c = new Circle(5);
		assertEquals(78.5398, c.calculateArea(), 0.0001);
	}

}
