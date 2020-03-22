package marsRoverInstructionJUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import MarsRoverMovement.TurnRightInstruction;
import RoverFactory.MarsRover;
import MarsRoverCoordinates.Coords;

public class TurnRightInstructionJUnitTest {
	@Test
	public void test() {
		Coords limitCoordinates = new Coords(3,3);
		Coords currentCoordinates = new Coords(1,1);
		char direction = 'N';
		TurnRightInstruction turnRight = new TurnRightInstruction();
		MarsRover rover1 = new MarsRover(limitCoordinates, currentCoordinates, direction);
		turnRight.Execute(rover1);
		assertEquals("E", rover1.getDirection().toString());
	}
}
