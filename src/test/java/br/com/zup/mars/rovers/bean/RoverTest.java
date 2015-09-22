package br.com.zup.mars.rovers.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.zup.mars.rovers.type.Direction;

public class RoverTest {

	Rover rover;
	
	@Before
	public void setUp(){
		rover = new Rover(1, 3, Direction.NORTH);
	}
	
	@Test
	public void testPosX() {
		rover.posX(2);
		assertTrue(rover.posX() > 0);
		assertTrue(rover.posX() == 2);
	}

	@Test
	public void testPosY() {
		rover.posY(3);
		assertTrue(rover.posY() > 0);
		assertTrue(rover.posY() == 3);
	}

	@Test
	public void testDirection() {
		rover.direction(Direction.SOUTH);
		assertEquals(rover.direction().getDescription(), "S");
		assertTrue(rover.direction().getValue() == 3);
	}

}
