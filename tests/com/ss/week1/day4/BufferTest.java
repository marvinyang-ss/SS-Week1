package com.ss.week1.day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BufferTest {
	
	private Buffer<Integer> buffer;

	@BeforeEach
	void setUp() throws Exception {
		buffer = new Buffer(10);
	}

	@Test
	void addTest() {
		for (int i = 0; i < buffer.getCapacity(); i++) {
			assertEquals(i, buffer.getSize());
			buffer.add(1);
		}
		assertEquals(buffer.getCapacity(), buffer.getSize());
		
		assertThrows(IllegalStateException.class, () -> {
			buffer.add(1);
		});
		
		assertEquals(buffer.getCapacity(), buffer.getSize());
	}
	
	@Test
	void removeTest() {
		buffer.add(1);
		
		assertEquals(1, buffer.getSize());
		assertEquals(1, buffer.remove());
		assertEquals(0, buffer.getSize());
		
		assertThrows(IllegalStateException.class, () -> {
			buffer.remove();
		});
		
		assertEquals(0, buffer.getSize());
	}

}
