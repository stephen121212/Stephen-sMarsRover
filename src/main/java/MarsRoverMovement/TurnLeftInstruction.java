package MarsRoverMovement;
import RoverFactory.Rover;

public class TurnLeftInstruction implements Instruction {
	@Override
	public Rover Execute(Rover marsRover) {
		marsRover.turnMarsRoverLeft();
		return marsRover;
	}
}