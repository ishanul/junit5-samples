package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void testMin() {
		int expectedValue = 2;
		int actualValue = Math.min(2, 5);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testMax() {
		int expectedValue = 5;
		int actualValue = Math.max(2, 5);
		assertEquals(expectedValue, actualValue);
	}

}
