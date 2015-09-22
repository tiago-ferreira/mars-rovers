package br.com.zup.mars.rovers.type;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectionTest {

	@Test
	public void test() {
		assertEquals(Direction.NORTH.getDescription(), "N");
		assertTrue(Direction.NORTH.getValue() == 1);
		assertEquals(Direction.EAST.getDescription(), "E");
		assertTrue(Direction.EAST.getValue() == 2);
		assertEquals(Direction.SOUTH.getDescription(), "S");
		assertTrue(Direction.SOUTH.getValue() == 3);
		assertEquals(Direction.WEST.getDescription(), "W");
		assertTrue(Direction.WEST.getValue() == 4);
	}

}
