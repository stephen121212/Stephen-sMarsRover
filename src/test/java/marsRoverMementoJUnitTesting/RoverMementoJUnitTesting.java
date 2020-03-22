package marsRoverMementoJUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import RoverFactory.MarsRover;
import RoverMemento.CareTaker;
import MarsRoverCoordinates.Coords;

public class RoverMementoJUnitTesting {
	@Test
	public void test() {
		Coords limitCoordinates = new Coords(3,3);
		Coords currentCoordinates = new Coords(1,1);
		char direction = 'N';
		MarsRover rover1 = new MarsRover(limitCoordinates, currentCoordinates, direction);

		CareTaker rvCareTaker = new CareTaker();
		rvCareTaker.save(rover1);
		assertEquals("N", rover1.getDirection().toString());
		
		rover1.setDirection('S');
		assertEquals("S", rover1.getDirection().toString());
		rvCareTaker.save(rover1);
		rvCareTaker.revert(rover1);
		rvCareTaker.revert(rover1);
		assertEquals("N", rover1.getDirection().toString());
	}		
}
