package MarsRoverMovement;

import RoverFactory.Rover;

public class MoveInstruction implements Instruction {
	@Override
	public Rover Execute(Rover marsRover) {
		marsRover.moveMarsRover();
		return marsRover;
	}
}
