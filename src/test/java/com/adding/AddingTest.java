package com.adding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingTest {

	@Test
	void test() {
		Adding e = new Adding();
		int expected = 2;
		int actual = e.add(1, 1);
		assertEquals(expected, actual);
	}

}
