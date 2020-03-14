package MarsRoverCommunication;

import marsRoverCoordinates.Coords;

public interface CommunicationMap {
	void communicationSizeOfMap();
	void parseSizeOfMap(String limitCoordinatesinString);
	void setSizeOfMap(int limitCoordinatesX, int limitCoordinatesY);
	Coords returnLimitCoordinates();
}
