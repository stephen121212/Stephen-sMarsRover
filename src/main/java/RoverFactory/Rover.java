package RoverFactory;

import MarsRoverCoordinates.Coords;
import MarsRoverDirection.DirectionMovement;
import RoverMemento.RoverMemento;

public interface Rover {
	RoverMemento save();
	void revert(RoverMemento pop);
	void setLimitCoordinates(Coords limitCoordinates);
	Coords getLimitCoordinates();
	void setCurrentCoordinates(Coords roverCurrentCoordinates);
	Coords getCurrentCoordinates();
	void moveMarsRover();
	void turnMarsRoverLeft();
	void turnMarsRoverRight();
	void setDirection(char roverDirection);
	DirectionMovement getDirection();
}