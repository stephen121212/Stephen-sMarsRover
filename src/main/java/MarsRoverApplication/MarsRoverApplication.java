package MarsRoverApplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		System.out.println(rv1.getDirection());
		System.out.println(rv1.getCurrentCoordinates().toString());
		System.out.println(rv1.getLimitCoordinates().toString());
		
		//Close the context
		context.close();
	}
}
