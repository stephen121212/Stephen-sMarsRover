package marsRoverInstructionJUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import MarsRoverMovement.TurnLeftInstruction;
import RoverFactory.MarsRover;
import MarsRoverCoordinates.Coords;

public class TurnLeftInstructionJUnitTest {
	@Test
	public void test() {
		Coords limitCoordinates = new Coords(3,3);
		Coords currentCoordinates = new Coords(1,1);
		char direction = 'N';
		TurnLeftInstruction turnLeft = new TurnLeftInstruction();
		MarsRover rover1 = new MarsRover(limitCoordinates, currentCoordinates, direction);
		turnLeft.Execute(rover1);
		assertEquals("W", rover1.getDirection().toString());
	}
}
