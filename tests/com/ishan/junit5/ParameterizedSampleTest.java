package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedSampleTest {

	@ParameterizedTest(name= "{0} length greater than zero")
	@ValueSource(strings= {"ABCD", "ABC", "AB", "A"})
	@DisplayName("Check Length Greater Than Zero Parameterized")
	void testLengthGreaterThanZeroParameterized(String str) {
		assertTrue(str.length() > 0);
		
	}
	
	@ParameterizedTest
	@CsvSource(value= {"abcd, ABCD", "abc, ABC", "b, B", "a, A"})
	@DisplayName("Check ToUpperCase Parameterized")
	void testToUpperCaseParameterized(String word, String capitalizedWord) {
		assertEquals(capitalizedWord, word.toUpperCase());
		
	}
	
	@ParameterizedTest(name="{0} Length is {1}")
	@CsvSource(value= {"abcd, 4", "abc, 3", "b, 1", "a, 1"})
	@DisplayName("Check Length Parameterized")
	void testLengthParameterized(String word, int expectedLength) {
		assertEquals(expectedLength, word.length());
		
	}

}
