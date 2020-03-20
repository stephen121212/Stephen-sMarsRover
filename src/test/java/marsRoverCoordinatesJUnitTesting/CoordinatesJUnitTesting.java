package marsRoverCoordinatesJUnitTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import marsRoverCoordinates.Coords;

public class CoordinatesJUnitTesting {
	@Test
	public void test() {
		Coords newCoordinates = new Coords();
		assertEquals(0, newCoordinates.getX());
		assertEquals(0, newCoordinates.getY());
		newCoordinates.setX(2);
		assertEquals(2, newCoordinates.getX());
		newCoordinates.setY(2);
		assertEquals(2, newCoordinates.getY());
		
		Coords newCoordinates2 = new Coords(3,3);
		assertEquals(3, newCoordinates2.getY());
		assertEquals(3, newCoordinates2.getX());
		
		assertEquals(false, newCoordinates.Compare(newCoordinates2));
		assertEquals(false, newCoordinates.isNegative());
		
		assertEquals(3, newCoordinates.moveXByAmount(1));
		assertEquals(3, newCoordinates.moveYByAmount(1));
		
		assertEquals("3 3", newCoordinates.toString());
	}
}
