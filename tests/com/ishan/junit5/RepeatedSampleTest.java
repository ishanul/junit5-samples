package com.ishan.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedSampleTest {

	@Test
	@RepeatedTest(5)
	@Disabled
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(7), () ->{
			for(int i =0; i < 1000000; i++) {
				int j = i;
				System.out.println(j);
			}
		});
	}
	
	@Test
	@RepeatedTest(5)
	@DisplayName("Repeated Contains")
	void testContainsRepeated() {
		boolean result = "abcdef".contains("gh");
		
		assertFalse(result);
	}

}
