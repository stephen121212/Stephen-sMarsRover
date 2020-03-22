package MarsRoverDirection;

import MarsRoverCoordinates.Coords;

public interface DirectionMovement {
	Coords Move(Coords input);
	
	DirectionMovement TurnLeft();
	
	DirectionMovement TurnRight();
}
