package marsRoverDirectionJUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import MarsRoverDirection.EastDirection;
import marsRoverCoordinates.Coords;

//Unit Testing
public class EastDirectionJUnitTesting {
	@Test
	public void test() {
		Coords currentCoordinates = new Coords(3,3);
		EastDirection eastDirection = new EastDirection(); 
		eastDirection.Move(currentCoordinates);
		assertEquals("4 3", currentCoordinates.toString());
		assertEquals("E", eastDirection.toString());
	}
}
