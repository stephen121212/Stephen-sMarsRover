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
		System.out.println("Type Begin to begin the program/ Or type Help to see how the program works");
		String startingString = sc.nextLine().toUpperCase();
		beginOrHelp(startingString);
	}
	
	public void beginOrHelp(String startingString) {
		switch(startingString) {
			case "BEGIN": enterCoordinatesLimits();
			break;
			case "HELP": helpClicked();
			break;
		}
	}
	
	public void enterCoordinatesLimits() {
		System.out.println("Enter in the Coordinates for the size of the map"); 
		String limitCoordinatesinString = sc.nextLine();
		parseSizeOfMap(limitCoordinatesinString);
	}
	
	public void helpClicked() {
		System.out.println("First enter in the Coordinates of the Map Size Limit, then enter in the Coordinates of the Current Coordinates of the Rover and the Direction the Rover is facing");
		System.out.println("The Instructions you can give to the Rover are: M-Move(Makes the Rover move forward), R-Right(Rover turns to the right) and L-Left (Rover turns to the left)");
		System.out.println("The system will return the Rover Current Coordinates and the Current Direction of the Rover");
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