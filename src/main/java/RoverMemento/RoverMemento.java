package RoverMemento;

import MarsRoverCoordinates.Coords;

public class RoverMemento {
	private Coords roverCurrentCoordinates;
	private String direction;

	public RoverMemento(Coords roverCurrentCoordinates, String direction) {
		this.roverCurrentCoordinates = roverCurrentCoordinates;
		this.direction = direction;
	}

	public Coords getRoverCoordinates() {
		return roverCurrentCoordinates;
	}

	public String getRoverDirection() {
		return direction;
	}
}