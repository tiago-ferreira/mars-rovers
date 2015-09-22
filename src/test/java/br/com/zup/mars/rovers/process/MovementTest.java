package br.com.zup.mars.rovers.process;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import br.com.zup.mars.rovers.bean.Rover;
import br.com.zup.mars.rovers.type.Direction;

public class MovementTest {

	Rover rover;
	Movement movement;
	
	@Before
	public void setUp(){
		rover = new Rover(1, 3, Direction.NORTH);
		movement = new Movement();
	}
	
	@Test
	public void testTurnLeft() {
		rover.direction(Direction.SOUTH);
		rover = executeMethod("turnLeft");
		assertTrue(rover.direction() == Direction.EAST);
	}
	
	@Test
	public void testTurnRight() {
		rover.direction(Direction.SOUTH);
		rover = executeMethod("turnRight");
		assertTrue(rover.direction() == Direction.WEST);
	}
	
	@Test
	public void testMove(){
		rover.direction(Direction.NORTH);
		rover.posY(2);
		rover = executeMethod("move");
		assertTrue(rover.posY() == 3);
	}
	
	private Rover executeMethod(String methodName){
		Method method;
		try {
			method = Movement.class.getDeclaredMethod(methodName, Rover.class);
			method.setAccessible(true);
			rover =  (Rover) method.invoke(movement,rover);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
		return rover;
	}

}
