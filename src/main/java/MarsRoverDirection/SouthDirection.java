package MarsRoverDirection;

import MarsRoverCoordinates.Coords;

public class SouthDirection implements DirectionMovement {
	@Override
	public Coords Move(Coords input) {
		input.MoveYByAmount(-1);
		return input;
	}

	@Override
	public DirectionMovement TurnLeft() {
		return new EastDirection();
	}

	@Override
	public DirectionMovement TurnRight() {
		return new WestDirection();
	}

	@Override
	public String toString() {
		return "S";
	}
}
