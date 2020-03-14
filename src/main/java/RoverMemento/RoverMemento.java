package RoverMemento;

import MarsRoverDirection.DirectionMovement;
import marsRoverCoordinates.Coords;

public class RoverMemento {
	private Coords roverCurrentCoordinates;
	private DirectionMovement direction;

	public RoverMemento(Coords roverCurrentCoordinates, DirectionMovement direction) {
		this.roverCurrentCoordinates = roverCurrentCoordinates;
		this.direction = direction;
	}

	public Coords getRoverCoordinates() {
		return roverCurrentCoordinates;
	}

	public DirectionMovement getRoverDirection() {
		return direction;
	}
}