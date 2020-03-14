package MarsRoverCommunication;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import MarsRoverMovement.Instruction;
import MarsRoverMovement.MoveInstruction;
import MarsRoverMovement.TurnLeftInstruction;
import MarsRoverMovement.TurnRightInstruction;
import RoverFactory.Rover;

public class CommunicationWithUserAboutInstructions implements CommunicationInstructions {
	public Scanner sc = new Scanner(System.in);
	private Rover marsRover;
	private static final Logger logger = Logger.getLogger(CommunicationWithUserAboutInstructions.class.getName());
	
	private Map<Character, Instruction> charMap;
	
	public CommunicationWithUserAboutInstructions(Rover marsRover) {
		charMap = new HashMap<Character,Instruction>();
		charMap.put('M', new MoveInstruction());
		charMap.put('L', new TurnLeftInstruction());
		charMap.put('R', new TurnRightInstruction());
		this.marsRover = marsRover;
	}
	
	public void communicationInstructionsOfVehicle() {
		logger.log(Level.INFO,"Enter in the Instructions of the Vehicle"); 
		String instructions = sc.nextLine();
		parseInstructions(instructions);
	}

	@Override
	public void parseInstructions(String instructions) {
		for(int i = 0; i < instructions.length(); i++){
			char instruction = instructions.charAt(i);
			processInstructions(instruction);
		}
	}
	
	public void processInstructions(char instruction) {
		try{
				Instruction newInstruction = charMap.get(instruction);
				newInstruction.Execute(marsRover);
			}
		catch(Exception e){
				throw new IllegalArgumentException("The instruction is invalid");
			}
	}
}
