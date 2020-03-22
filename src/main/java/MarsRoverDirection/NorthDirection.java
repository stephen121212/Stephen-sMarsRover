package MarsRoverDirection;

import MarsRoverCoordinates.Coords;

public class NorthDirection implements DirectionMovement {
	@Override
	public Coords Move(Coords input) {
		input.moveYByAmount(1);
		return input;
	}

	@Override
	public DirectionMovement TurnLeft() {
		return new WestDirection();
	}

	@Override
	public DirectionMovement TurnRight() {
		return new EastDirection();
	}

	@Override
	public String toString() {
		String currentDirection = "N";
		return currentDirection;
	}
}
