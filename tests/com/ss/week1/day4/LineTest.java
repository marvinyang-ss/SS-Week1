package com.ss.week1.day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LineTest {

	@Test
	void getSlopeTest() {
		assertEquals(1.0, new Line(-2,-2,2,2).getSlope(), 0.0001);
		assertEquals(0.0, new Line(0,3,4,3).getSlope(), 0.0001);
		assertEquals(-2.0, new Line(-1,6,3,-2).getSlope(), 0.0001);
		assertEquals(0.3333, new Line(2,1,5,2).getSlope(), 0.0001);
		
		assertThrows(ArithmeticException.class, () -> {
			new Line(1,2,1,4).getSlope();
		});
	}
	
	@Test
	void getDistanceTest() {
		assertEquals(5.6569, new Line(-2,-2,2,2).getDistance(), 0.0001);
		assertEquals(4.0, new Line(0,3,4,3).getDistance(), 0.0001);
		assertEquals(0.0, new Line(0,0,0,0).getDistance(), 0.0001);
	}
	
	@Test
	void parallelToTest() {
		assertTrue(new Line(-2,-2,2,2).parallelTo(new Line(1,0,2,1)));
		assertTrue(new Line(0,0,1,1).parallelTo(new Line(0,0,1,1)));

		assertFalse(new Line(-2,-2,2,2).parallelTo(new Line(1,0,2,2)));
	}

}
