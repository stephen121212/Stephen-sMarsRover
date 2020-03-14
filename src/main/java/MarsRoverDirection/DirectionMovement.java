package MarsRoverDirection;

import marsRoverCoordinates.Coords;

public interface DirectionMovement {
	Coords Move(Coords input);
	
	DirectionMovement TurnLeft();
	
	DirectionMovement TurnRight();
}
