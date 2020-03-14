package RoverFactory;

import MarsRoverCommunication.JavaMarsTestProgram;
import marsRoverCoordinates.Coords;

public class RoverFactory {
	private JavaMarsTestProgram javaTestProgram;
	Coords limitCoordinates;
	Coords roverCurrentCoordinates;
	char roverDirection;
	
	public RoverFactory(JavaMarsTestProgram javaTestProgram) {
		this.javaTestProgram = javaTestProgram;
		assignCoordinatesAndDirection();
	}
	
	public void assignCoordinatesAndDirection() {
		this.limitCoordinates = this.javaTestProgram.getLimitCoordinates();
		this.roverCurrentCoordinates = this.javaTestProgram.getCurrentCoordinates();
		this.roverDirection = this.javaTestProgram.getDirection();
	}
	
	public Rover createRover(String roverType) {
		switch (roverType) {
		case "MARSROVER":
			return new MarsRover(limitCoordinates, roverCurrentCoordinates, roverDirection);
		default:
			return null;
		}
	}
}