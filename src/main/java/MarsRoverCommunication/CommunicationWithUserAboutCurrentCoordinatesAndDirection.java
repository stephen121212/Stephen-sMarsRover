package MarsRoverCommunication;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import MarsRoverCoordinates.Coords;

public class CommunicationWithUserAboutCurrentCoordinatesAndDirection implements CommunicationCoordinates {
	public Scanner sc = new Scanner(System.in);
	public Coords currentRoverCoordinates;
	public char currentDirection;
	private static final Logger logger = Logger.getLogger(CommunicationWithUserAboutCurrentCoordinatesAndDirection.class.getName());
	
	public CommunicationWithUserAboutCurrentCoordinatesAndDirection() {
		currentRoverCoordinates = new Coords();
		currentDirection = 'N';
	}
	
	public void communicationCurrentCoordinatesAndDirection() {
		enterCoordinatesAndDirection();
	}
	
	public void enterCoordinatesAndDirection() {
		logger.log(Level.INFO,"Enter in the Coordinates of the rover and the current Direction");
		String currentRoverCoordinatesinString = sc.nextLine();
		parseCurrentCoordinates(currentRoverCoordinatesinString);
	}
	
	public void parseCurrentCoordinates(String currentRoverCoordinatesinString) {
		String[] currentRoverCoordinatesinArray = currentRoverCoordinatesinString.split(" ", 3);
		
		int currentCoordinatesX = Integer.parseInt(currentRoverCoordinatesinArray[0]);
		int currentCoordinatesY = Integer.parseInt(currentRoverCoordinatesinArray[1]);
		setCurrentCoordinates(currentCoordinatesX, currentCoordinatesY);
	}
	
	public void setCurrentCoordinates(int currentCoordinatesX, int currentCoordinatesY) {
		currentRoverCoordinates.setX(currentCoordinatesX);
		currentRoverCoordinates.setY(currentCoordinatesY);
	}
	
	public void setDirection(String[] currentRoverCoordinatesinArray) {
		String currentDirectionInSpring = currentRoverCoordinatesinArray[2];
		char currentDirectionInChar = currentDirectionInSpring.charAt(0);
		this.currentDirection = currentDirectionInChar;
	}
	
	public char getDirection() {
		return this.currentDirection;
	}

	public Coords returnCurrentCoordinates() {
		return this.currentRoverCoordinates;
	}
}