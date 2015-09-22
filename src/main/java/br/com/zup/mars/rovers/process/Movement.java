package br.com.zup.mars.rovers.process;

import br.com.zup.mars.rovers.bean.Rover;
import br.com.zup.mars.rovers.type.Command;
import br.com.zup.mars.rovers.type.Direction;

public class Movement {


	
	public Rover executeMovement(Rover rover, String direction) {
		for (int i = 0; i < direction.length(); i++) {
			rover = process(rover,direction.toUpperCase().charAt(i));
		}
		return rover;
	}

	private Rover process(Rover rover, Character character) {
        if (character.toString().equals(Command.LEFT.getDescription())) {
            rover = turnLeft(rover);
        } else if (character.toString().equals(Command.RIGHT.getDescription())) {
            rover = turnRight(rover);
        } else if (character.toString().equals(Command.MOVE.getDescription())) {
            rover = move(rover);
        } else {
            throw new IllegalArgumentException("Speak in Mars language, please!");
        }
		
		return rover;
	}

	private Rover move(Rover rover) {
        if (rover.direction() == Direction.NORTH) {
            rover.posY( rover.posY() + 1);
        } else if (rover.direction() == Direction.EAST) {
            rover.posX( rover.posX() + 1);
        } else if (rover.direction() == Direction.SOUTH) {
        	rover.posY( rover.posY() - 1 );
        } else if (rover.direction() == Direction.WEST) {
        	rover.posX( rover.posX() - 1 );
        }
		return rover;
	}

	private Rover turnRight(Rover rover) {
		Integer value = (rover.direction().getValue() + 1) > Direction.WEST.getValue() ? Direction.NORTH.getValue() : rover.direction().getValue() + 1 ;
		rover.direction(Direction.getDirection(value));
		return rover;
	}

	private Rover turnLeft(Rover rover) {
		Integer value = (rover.direction().getValue() - 1) < Direction.NORTH.getValue() ? Direction.WEST.getValue() : rover.direction().getValue() - 1 ;
		rover.direction(Direction.getDirection(value));
		return rover;
	}
}
