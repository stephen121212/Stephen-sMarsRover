package MarsRoverApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import MarsRoverCommunication.CommunicationWithUserAboutInstructions;
import RoverFactory.Rover;
import RoverFactory.RoverFactory;
import RoverMemento.CareTaker;

public class MarsRoverApplication {
	public static void main(String[] args) {
		//Load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring  container
		CareTaker rvCareTaker = context.getBean("RoverMemento", CareTaker.class);
		RoverFactory rv = context.getBean("MarsRoverFactory", RoverFactory.class);
		
		//Call methods on the bean 
		Rover rv1 = rv.createRover("MARSROVER");
		CommunicationWithUserAboutInstructions cwuAboutInstructions = new CommunicationWithUserAboutInstructions(rv1);
		cwuAboutInstructions.communicationInstructionsOfVehicle();
		rvCareTaker.save(rv1);
		rv1.setDirection('N');
		System.out.println("Current Coordinates: " + rv1.getCurrentCoordinates() + " Direction: " + rv1.getDirection().toString());
		
		//Close the context
		context.close();
	}
}
