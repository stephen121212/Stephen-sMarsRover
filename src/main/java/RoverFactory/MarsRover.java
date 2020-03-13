package RoverFactory;

import MarsRoverCoordinates.Coords;
import RoverMemento.RoverMemento;

public class MarsRover implements Rover {
	private Coords limitCoordinates;
	private Coords roverCurrentCoordinates;
	private String roverDirection;

	public MarsRover() {

	}

	public MarsRover(Coords limitcoordinates, Coords roverCurrentCoordinates, String roverDirection) {
		this.limitCoordinates = limitcoordinates;
		this.roverCurrentCoordinates = roverCurrentCoordinates;
		this.roverDirection = roverDirection;
	}
	
	@Override
	public void setLimitCoordinates(Coords limitCoordinates) {
		this.limitCoordinates = limitCoordinates;
	}
	
	@Override
	public Coords getLimitCoordinates() {
		return this.limitCoordinates;
	}

	@Override
	public void setCurrentCoordinates(Coords roverCurrentCoordinates) {
		this.roverCurrentCoordinates = roverCurrentCoordinates;
	}

	@Override
	public Coords getCurrentCoordinates() {
		return this.roverCurrentCoordinates;
	}
	
	@Override
	public String getDirection() {
		return this.roverDirection;
	}

	@Override
	public void setDirection(String roverDirection) {
		this.roverDirection = roverDirection;
	}

	public RoverMemento save() {
		return new RoverMemento(this.roverCurrentCoordinates, this.roverDirection);
	}

	public void revert(RoverMemento rv) {
		this.roverCurrentCoordinates = rv.getRoverCoordinates();
		this.roverDirection = rv.getRoverDirection();
	}

	@Override
	public void moveForward(Coords currentCoordinates, String currentDirection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft(String currentDirection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight(String currentDirection) {
		// TODO Auto-generated method stub
		
	}
}