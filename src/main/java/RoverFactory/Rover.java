package RoverFactory;

import MarsRoverCoordinates.Coords;
import RoverMemento.RoverMemento;

public interface Rover {
	void moveForward(Coords currentCoordinates, String currentDirection);
	void setDirection(String direction);
	String getDirection();
	void turnLeft(String currentDirection);
	void turnRight(String currentDirection);
	RoverMemento save();
	void revert(RoverMemento pop);
	void setLimitCoordinates(Coords limitCoordinates);
	Coords getLimitCoordinates();
	void setCurrentCoordinates(Coords roverCurrentCoordinates);
	Coords getCurrentCoordinates();
}