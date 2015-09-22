package br.com.zup.mars.rovers.type;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum Direction {
	NORTH("N", 1), EAST("E", 2), SOUTH("S", 3), WEST("W", 4);

	private String description;
	private Integer value;
	private static final Map<Integer, Direction> lookup = new HashMap<Integer, Direction>();

	static {
		for (Direction d : EnumSet.allOf(Direction.class))
			lookup.put(d.getValue(), d);
	}

	Direction(String description, Integer value) {
		this.description = description;
		this.value = value;
	}

	public String getDescription() {
		return description.toUpperCase();
	}

	public Integer getValue() {
		return value;
	}

	public static Direction getDirection(int code) {
		return lookup.get(code);
	}

}
