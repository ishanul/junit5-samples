package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DisplayNameSampleTest {

	@Test
	@DisplayName("Check Length Greater Than Zero")
	void testLengthGreaterThanZero() {
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("A".length() > 0);
		assertTrue("AB".length() > 0);
	}
	

}
