package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAllTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all tests");
	}
	
	@Test
	void testLength() {
		int actualLength = "ABCDE".length();
		//Assert length == 4
		int expectedLength = 5;
		assertEquals(expectedLength, actualLength);
		
	}
}
