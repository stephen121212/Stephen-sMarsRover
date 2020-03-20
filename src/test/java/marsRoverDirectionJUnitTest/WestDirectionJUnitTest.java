package marsRoverDirectionJUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import MarsRoverDirection.WestDirection;
import marsRoverCoordinates.Coords;

public class WestDirectionJUnitTest {
	@Test
	public void test() {
		Coords currentCoordinates = new Coords(3,3);
		WestDirection westDirection = new WestDirection(); 
		westDirection.Move(currentCoordinates);
		assertEquals("2 3", currentCoordinates.toString());
		assertEquals("W", westDirection.toString());
	}
}
