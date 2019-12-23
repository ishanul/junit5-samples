package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class AfterEachTest {

	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("After the test " + info.getDisplayName());
	}
	@Test
	void testLength() {
		int actualLength = "ABCDE".length();
		//Assert length == 4
		int expectedLength = 5;
		assertEquals(expectedLength, actualLength);
		
	}

}
