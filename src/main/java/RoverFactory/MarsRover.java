package RoverFactory;

import java.util.HashMap;
import java.util.Map;

import MarsRoverDirection.DirectionMovement;
import MarsRoverDirection.EastDirection;
import MarsRoverDirection.NorthDirection;
import MarsRoverDirection.SouthDirection;
import MarsRoverDirection.WestDirection;
import RoverMemento.RoverMemento;
import marsRoverCoordinates.Coords;

public class MarsRover implements Rover {
	private Coords limitCurrentCoordinates;
	private Coords roverCurrentCoordinates;
	private DirectionMovement roverDirection;
	private Map<Character, DirectionMovement> directionMap; 

	public MarsRover() {

	}

	public MarsRover(Coords limitcoordinates, Coords roverCurrentCoordinates, char roverDirection) {
		directionMap = new HashMap<Character,DirectionMovement>();
		directionMap.put('N', new NorthDirection());
		directionMap.put('S', new SouthDirection());
		directionMap.put('E', new EastDirection());
		directionMap.put('W', new WestDirection());
		ValidateLimits(limitcoordinates);
		this.limitCurrentCoordinates = limitcoordinates;
		
		ValidatePosition(roverCurrentCoordinates, "Invalid positions was inputted for vehicle");
		this.roverCurrentCoordinates = roverCurrentCoordinates;
		

		ValidateDirection(roverDirection);
		this.roverDirection = directionMap.get(roverDirection);
	}
	
	private void ValidatePosition(Coords roverCurrentCoordinates, String message) {
		if (roverCurrentCoordinates.isNegative() || roverCurrentCoordinates.Compare(limitCurrentCoordinates)){
			throw new IllegalArgumentException(message);
		}
	}
	
	private void ValidateLimits(Coords limitCoordinates) {
		if (limitCoordinates.isNegative()){
			throw new IllegalArgumentException("Invalid limits were inputted for vehicle");
		}
	}
	
	public void ValidateDirection(char orientation) {
		if (!directionMap.containsKey(orientation)){
			throw new IllegalArgumentException("Invalid orientation was inputted for vehicle");
		}
	}
	
	@Override
	public void setLimitCoordinates(Coords limitCoordinates) {
		this.limitCurrentCoordinates = limitCoordinates;
	}
	
	@Override
	public Coords getLimitCoordinates() {
		return this.limitCurrentCoordinates;
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
	public DirectionMovement getDirection() {
		return this.roverDirection;
	}

	@Override
	public void setDirection(char roverDirection) {
		this.roverDirection = directionMap.get(roverDirection);
	}
	
	public RoverMemento save() {
		return new RoverMemento(this.roverCurrentCoordinates, this.roverDirection);
	}

	public void revert(RoverMemento rv) {
		this.roverCurrentCoordinates = rv.getRoverCoordinates();
		this.roverDirection = rv.getRoverDirection();
	}
	
	@Override
	public String toString() {
		return roverCurrentCoordinates.toString() + roverDirection.toString();
	}

	@Override
	public void moveMarsRover() {
		roverDirection.Move(roverCurrentCoordinates);
		ValidatePosition(roverCurrentCoordinates, "Vehicle has moved out of bounds");
	}

	@Override
	public void turnMarsRoverLeft() {
		roverDirection = roverDirection.TurnLeft();
	}

	@Override
	public void turnMarsRoverRight() {
		roverDirection = roverDirection.TurnRight(); 
	}
}