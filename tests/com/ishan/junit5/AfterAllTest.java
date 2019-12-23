package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class AfterAllTest {

	@AfterAll
	static void afterAll() {
		System.out.println("After all tests");
	}
	
	@Test
	void testLength() {
		int actualLength = "ABCDE".length();
		//Assert length == 4
		int expectedLength = 5;
		assertEquals(expectedLength, actualLength);
		
	}

}
