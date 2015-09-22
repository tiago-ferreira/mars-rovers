package br.com.zup.mars.rovers.type;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test() {
		assertEquals(Command.LEFT.getDescription(),"L");
		assertEquals(Command.RIGHT.getDescription(),"R");
		assertEquals(Command.MOVE.getDescription(),"M");
	}

}
