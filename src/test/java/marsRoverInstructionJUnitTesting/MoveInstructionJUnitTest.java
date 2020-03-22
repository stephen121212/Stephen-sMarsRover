package marsRoverInstructionJUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import RoverFactory.MarsRover;
import MarsRoverCoordinates.Coords;

public class MoveInstructionJUnitTest {
	@Test
	public void test() {
		Coords limitCoordinates = new Coords(3,3);
		Coords currentCoordinates = new Coords(1,1);
		char direction = 'N';
		MarsRover rover1 = new MarsRover(limitCoordinates, currentCoordinates, direction);
		rover1.moveMarsRover();
		assertEquals("1 2", rover1.getCurrentCoordinates().toString());
	}
}
