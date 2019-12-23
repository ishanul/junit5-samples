package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {

	private String str = "Test";
	@Test
	void test() {
		
	}
	
	@Nested
	@DisplayName("for empty string test")
	class EmptyString{
		
		@BeforeEach
		void setToEmpty() {
			str = "";
		}
		
		@Test
		void testEmpty() {
			assertEquals("", str);
		}
		
		@Test
		void testLength() {
			assertEquals(0, str.length());
		}
	}

}
