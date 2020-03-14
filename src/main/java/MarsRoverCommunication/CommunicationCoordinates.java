package MarsRoverCommunication;

import marsRoverCoordinates.Coords;

public interface CommunicationCoordinates {
	void communicationCurrentCoordinatesAndDirection();
	void parseCurrentCoordinates(String currentRoverCoordinatesinString);
	void setCurrentCoordinates(int currentCoordinatesX, int currentCoordinatesY);
	void setDirection(String[] currentRoverCoordinatesinArray);
	char getDirection();
	Coords returnCurrentCoordinates();
}
