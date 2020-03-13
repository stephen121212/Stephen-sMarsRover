package MarsRoverMovement;
import RoverFactory.Rover;

public class TurnRightInstruction implements Instruction {
	@Override
	public Rover Execute(Rover marsRover) {
		marsRover.turnMarsRoverRight();
		return marsRover;
	}
}