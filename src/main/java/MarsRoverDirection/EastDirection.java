package MarsRoverDirection;

import MarsRoverCoordinates.Coords;

public class EastDirection implements DirectionMovement {

	@Override
	public Coords Move(Coords input) {
		input.moveXByAmount(1);
		return input;
	}

	@Override
	public DirectionMovement TurnLeft() {
		return new NorthDirection();
	}

	@Override
	public DirectionMovement TurnRight() {
		return new SouthDirection();
	}

	@Override
	public String toString() {
		String currentDirection = "E";
		return currentDirection;
	}
}
