package marsRoverAndFactoryJUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import RoverFactory.MarsRover;
import marsRoverCoordinates.Coords;

//Unit Test
public class MarsRoverJUnitTest {
	@Test
	public void test() {
		Coords limitCoordinates = new Coords(3,3);
		Coords currentCoordinates = new Coords(1,1);
		Coords newlimitCoordinates = new Coords(5,5);
		Coords newCurrentCoordinates = new Coords(2,2);
		char direction = 'N';
		MarsRover rover1 = new MarsRover(limitCoordinates, currentCoordinates, direction);
		assertEquals("3 3", rover1.getLimitCoordinates().toString());
		assertEquals("1 1", rover1.getCurrentCoordinates().toString());
		assertEquals("N", rover1.getDirection().toString());
		
		rover1.setLimitCoordinates(newlimitCoordinates);
		rover1.setCurrentCoordinates(newCurrentCoordinates);
		rover1.setDirection('E');
		assertEquals("5 5", rover1.getLimitCoordinates().toString());
		assertEquals("2 2", rover1.getCurrentCoordinates().toString());
		assertEquals("E", rover1.getDirection().toString());
		
		rover1.turnMarsRoverLeft();
		assertEquals("N", rover1.getDirection().toString());
		rover1.turnMarsRoverRight();
		assertEquals("E", rover1.getDirection().toString());
		
		rover1.moveMarsRover();
		assertEquals("3 2", rover1.getCurrentCoordinates().toString());
	}
}
