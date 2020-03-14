package MarsRoverDirection;

import marsRoverCoordinates.Coords;

public class WestDirection implements DirectionMovement {
	@Override
	public Coords Move(Coords input) {
		input.moveXByAmount(-1);
		return input;
	}

	@Override
	public DirectionMovement TurnLeft() {
		return new SouthDirection();
	}

	@Override
	public DirectionMovement TurnRight() {
		return new NorthDirection();
	}

	@Override
	public String toString() {
		String currentDirection = "W";
		return currentDirection;
	}
}
