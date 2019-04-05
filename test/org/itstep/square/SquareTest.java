package org.itstep.square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testGetArea() {
		Square square1 = new Square(10);
		assertEquals(100.0, square1.getArea());
		
		Square square2 = new Square(15);
		assertEquals(225.0, square2.getArea());
	}

}
