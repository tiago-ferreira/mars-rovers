package br.com.zup.mars.rovers.bean;

import br.com.zup.mars.rovers.type.Direction;

public class Rover {
	
	private Integer posX;
	private Integer posY;
	private Direction direction;

	public Rover(Integer posX, Integer posY, Direction direction) {
		this.posX = posX;
		this.posY = posY;
		this.direction = direction;
	}

	public Rover posX(Integer posX) {
		this.posX = posX;
		return this;
	}

	public Integer posX() {
		return posX;
	}

	public Rover posY(Integer posY) {
		this.posY = posY;
		return this;
	}

	public Integer posY() {
		return posY;
	}

	public Rover direction(Direction direction) {
		this.direction = direction;
		return this;
	}

	public Direction direction() {
		return direction;
	}

	public void printRover(Rover rover) {
		System.out.println(this.posX + " " + this.posY + " " + this.direction.getDescription());
	}
}
