package br.com.zup.mars.rovers.type;

public enum Command {

	MOVE("M"), LEFT("L"), RIGHT("R");

	private String description;

	Command(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description.toUpperCase();
	}
}
