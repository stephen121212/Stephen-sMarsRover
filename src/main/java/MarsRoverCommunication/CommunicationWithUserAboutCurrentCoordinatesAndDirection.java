package MarsRoverCommunication;

import java.util.Scanner;

import MarsRoverCoordinates.Coords;

public class CommunicationWithUserAboutCurrentCoordinatesAndDirection implements CommunicationCoordinates {
	public Scanner sc = new Scanner(System.in);
	public Coords currentRoverCoordinates;
	public String currentDirection;
	
	public CommunicationWithUserAboutCurrentCoordinatesAndDirection() {
		currentRoverCoordinates = new Coords();
		currentDirection = "N";
	}
	
	public void communicationCurrentCoordinatesAndDirection() {
		System.out.println("Enter in the Coordinates of the rover and the current Direction");
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
		currentDirection = currentRoverCoordinatesinArray[2];
	}
	
	public String getDirection() {
		return currentDirection;
	}
	
	public Coords returnCurrentCoordinates() {
		return this.currentRoverCoordinates;
	}
}