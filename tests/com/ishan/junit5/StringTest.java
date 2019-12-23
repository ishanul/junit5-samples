package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testLength() {
		int actualLength = "ABCDE".length();
		//Assert length == 4
		int expectedLength = 5;
		assertEquals(expectedLength, actualLength);
		
	}

	@Test
	void testToUpperCase() {
		String str = "abcd";
		String result = str.toUpperCase();
		assertEquals("ABCD", result);
		assertNotNull(result);
	}
	
	@Test
	void testContains() {
		boolean result = "abcdef".contains("gh");
		
		assertFalse(result);
	}
	
	
	
	@Test
	void testSplit() {
		String str = "abc def ghi";
		String result [] = str.split(" ");
		String expected [] = new String[] {"abc", "def", "ghi"};
		
		assertArrayEquals(expected, result);
	}
	
	
}
