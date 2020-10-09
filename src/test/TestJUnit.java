package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.JUnitTestSum;

class TestJUnit {

	@Test
	void testJUnitTestSumByDivZero() {
		JUnitTestSum jts = new JUnitTestSum();
		assertEquals(1, jts.div(2, 2));
		
		
	}

}
