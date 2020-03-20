package marsRoverAndFactoryJUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import RoverFactory.Rover;
import RoverFactory.RoverFactory;
import marsRoverCoordinates.Coords;

public class RoverFactoryJUnitTest {
	@Test
	public void test() {
		Coords limitCoordinates = new Coords(3,3);
		Coords currentCoordinates = new Coords(1,1);
		char direction = 'N';
		RoverFactory rf = new RoverFactory(limitCoordinates, currentCoordinates, direction);
		Rover marsRover = rf.createRover("MARSROVER");
		assertEquals("3 3", marsRover.getLimitCoordinates().toString());
		assertEquals("1 1", marsRover.getCurrentCoordinates().toString());
		assertEquals("N", marsRover.getDirection().toString());
	}
}
