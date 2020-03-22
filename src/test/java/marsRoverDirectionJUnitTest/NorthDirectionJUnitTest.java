package marsRoverDirectionJUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import MarsRoverDirection.NorthDirection;
import MarsRoverCoordinates.Coords;

public class NorthDirectionJUnitTest {
	@Test
	public void test() {
		Coords currentCoordinates = new Coords(3,3);
		NorthDirection northDirection = new NorthDirection(); 
		northDirection.Move(currentCoordinates);
		assertEquals("3 4", currentCoordinates.toString());
		assertEquals("N", northDirection.toString());
	}
}
