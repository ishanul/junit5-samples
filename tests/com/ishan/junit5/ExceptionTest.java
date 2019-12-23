package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExceptionTest {

	@Test
	@DisplayName("When the Length is Null")
	void testLengthNullPointer() {
		String str = null;
		assertThrows(NullPointerException.class, () -> {
			str.length();
		}

		);
	}

}
