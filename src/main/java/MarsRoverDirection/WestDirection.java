package MarsRoverDirection;

import MarsRoverCoordinates.Coords;

public class WestDirection implements DirectionMovement {
	@Override
	public Coords Move(Coords input) {
		input.MoveXByAmount(-1);
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
		return new String("W");
	}
}
