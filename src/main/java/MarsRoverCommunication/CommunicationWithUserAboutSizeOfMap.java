package MarsRoverCommunication;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import MarsRoverCoordinates.Coords;

public class CommunicationWithUserAboutSizeOfMap implements CommunicationMap {
	public Scanner sc = new Scanner(System.in);
	public Coords limitCoordinates;
	private static final Logger logger = Logger.getLogger(CommunicationWithUserAboutSizeOfMap.class.getName());
	
	public CommunicationWithUserAboutSizeOfMap() {
		limitCoordinates = new Coords();
	}
	
	public void communicationSizeOfMap() {
		logger.log(Level.INFO,"Type Begin to begin the program/ Or type Help to see how the program works");
		String startingString = sc.nextLine().toUpperCase();
		beginOrHelp(startingString);
	}
	
	public void beginOrHelp(String startingString) {
		switch(startingString) {
			case "BEGIN": enterCoordinatesLimits();
			break;
			case "HELP": helpClicked();
			break;
			default: logger.log(Level.SEVERE,"Invalid answer was given, exiting the program");
			System.exit(1);
		}
	}
	
	public void enterCoordinatesLimits() {
		logger.log(Level.INFO,"Enter in the Coordinates for the size of the map"); 
		String limitCoordinatesinString = sc.nextLine();
		parseSizeOfMap(limitCoordinatesinString);
	}
	
	public void helpClicked() {
		logger.log(Level.INFO,"First enter in the Coordinates of the Map Size Limit, then enter in the Coordinates of the Current Coordinates of the Rover and the Direction the Rover is facing");
		logger.log(Level.INFO,"The Instructions you can give to the Rover are: M-Move(Makes the Rover move forward), R-Right(Rover turns to the right) and L-Left (Rover turns to the left)");
		logger.log(Level.INFO,"The system will return the Rover Current Coordinates and the Current Direction of the Rover");
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