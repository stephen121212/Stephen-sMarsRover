package RoverFactory;

import MarsRoverDirection.DirectionMovement;
import RoverMemento.RoverMemento;
import marsRoverCoordinates.Coords;

public interface Rover {
	RoverMemento save();
	void revert(RoverMemento rv);
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