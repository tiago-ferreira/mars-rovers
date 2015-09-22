package br.com.zup.mars.rovers;

import br.com.zup.mars.rovers.bean.Rover;
import br.com.zup.mars.rovers.process.Movement;
import br.com.zup.mars.rovers.type.Direction;

public class Execute {

	public static void main(String[] args) {

		Movement movement = new Movement();

		Rover rover = new Rover(1, 2, Direction.NORTH);
		rover = movement.executeMovement(rover, "LMLMLMLMM");
		rover.printRover(rover);

		rover = new Rover(3, 3, Direction.EAST);
		rover = movement.executeMovement(rover, "MMRMMRMRRM");
		rover.printRover(rover);

	}

}
