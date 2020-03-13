package MarsRoverMovement;

import RoverFactory.Rover;

public interface Instruction {
	Rover Execute(Rover vehicle);
}
