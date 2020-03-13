package MarsRoverCommunication;

import java.util.Scanner;

import MarsRoverCoordinates.Coords;

public class CommunicationWithUserAboutSizeOfMap implements CommunicationMap {
	public Scanner sc = new Scanner(System.in);
	public Coords limitCoordinates;
	
	public CommunicationWithUserAboutSizeOfMap() {
		limitCoordinates = new Coords();
	}
	
	public void communicationSizeOfMap() {
		System.out.println("Enter in the Coordinates for the size of the map"); 
		String limitCoordinatesinString = sc.nextLine();
		parseSizeOfMap(limitCoordinatesinString);
	}
	
	public void parseSizeOfMap(String limitCoordinatesinString) {
		String[] limitCoordinatesinArray = limitCoordinatesinString.split(" ", 2);
		int limitCoordinatesX = Integer.parseInt(limitCoordinatesinArray[0]);
		int limitCoordinatesY = Integer.parseInt(limitCoordinatesinArray[1]);
		setSizeOfMap(limitCoordinatesX, limitCoordinatesY);
	}
	
	public void setSizeOfMap(int limitCoordinatesX, int limitCoordinatesY) {
		limitCoordinates.setX(limitCoordinatesX);
		limitCoordinates.setY(limitCoordinatesY);
	}
	
	public Coords returnLimitCoordinates() {
		return this.limitCoordinates;
	}
}