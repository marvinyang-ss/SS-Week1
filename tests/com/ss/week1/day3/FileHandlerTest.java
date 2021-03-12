package com.ss.week1.day3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileHandlerTest {
	
	private FileHandler fh;
	private Scanner scanner;
	
	@BeforeEach
	void setUp() throws Exception {
		fh = new FileHandler();
		scanner = new Scanner(System.in);
	}

	@Test
	void requestFileTest() {
		File file = fh.requestFile(scanner);
		assertTrue(file.isFile());
	}
	
	@Test
	void requestDirectoryTest() {
		File directory = fh.requestDirectory(scanner);
		assertTrue(directory.isDirectory());
	}

}
