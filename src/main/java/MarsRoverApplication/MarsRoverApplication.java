package MarsRoverApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import MarsRoverCommunication.CommunicationWithUserAboutInstructions;
import RoverFactory.Rover;
import RoverFactory.RoverFactory;

public class MarsRoverApplication {
	public static void main(String[] args) {
		//Load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring  container
		RoverFactory rv = context.getBean("MarsRoverFactory", RoverFactory.class);
		
		//Call methods on the bean 
		Rover rv1 = rv.createRover("MARSROVER");
		CommunicationWithUserAboutInstructions cwuAboutInstructions = new CommunicationWithUserAboutInstructions(rv1);
		cwuAboutInstructions.communicationInstructionsOfVehicle();
		
		//Close the context
		context.close();
	}
}
