package MarsRoverCommunication;

import MarsRoverCoordinates.Coords;

public class JavaMarsTestProgram {
		private CommunicationWithUserAboutSizeOfMap commMap;
		private CommunicationWithUserAboutCurrentCoordinatesAndDirection commCoords;
		
		public JavaMarsTestProgram() {
			commMap = new CommunicationWithUserAboutSizeOfMap();
			commCoords = new CommunicationWithUserAboutCurrentCoordinatesAndDirection();
			getCommunicationSizeOfMap();
			getCommunicationAboutCurrentCoordinatesAndDirection();
		}
		
		public void getCommunicationAboutCurrentCoordinatesAndDirection() {
			this.commCoords.communicationCurrentCoordinatesAndDirection();
		}
		
		public void getCommunicationSizeOfMap() {
			this.commMap.communicationSizeOfMap();
		}
		
		public Coords getLimitCoordinates() {
			return this.commMap.returnLimitCoordinates();
		}
		
		public Coords getCurrentCoordinates() {
			return this.commCoords.returnCurrentCoordinates();
		}

		public char getDirection() {
			return this.commCoords.getDirection();
		}
}
