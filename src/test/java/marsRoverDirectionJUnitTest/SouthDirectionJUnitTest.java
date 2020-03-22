package marsRoverDirectionJUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import MarsRoverDirection.SouthDirection;
import MarsRoverCoordinates.Coords;

public class SouthDirectionJUnitTest {
	@Test
	public void test() {
		Coords currentCoordinates = new Coords(3,3);
		SouthDirection southDirection = new SouthDirection(); 
		southDirection.Move(currentCoordinates);
		assertEquals("3 2", currentCoordinates.toString());
		assertEquals("S", southDirection.toString());
	}
}
