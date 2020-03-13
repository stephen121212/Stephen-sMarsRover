package MarsRoverCommunication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import MarsRoverMovement.Instruction;
import MarsRoverMovement.MoveInstruction;
import MarsRoverMovement.TurnLeftInstruction;
import MarsRoverMovement.TurnRightInstruction;
import RoverFactory.Rover;

public class CommunicationWithUserAboutInstructions implements CommunicationInstructions {
	public Scanner sc = new Scanner(System.in);
	private Rover marsRover;
	
	private Map<Character, Instruction> charMap = new HashMap<Character,Instruction>() {/**
		 * 
		 */
		private static final long serialVersionUID = 3187190494001035512L;

	{
		put('M', new MoveInstruction());
		put('L', new TurnLeftInstruction());
		put('R', new TurnRightInstruction());
	}};
	
	public CommunicationWithUserAboutInstructions() {
		
	}
	
	public CommunicationWithUserAboutInstructions(Rover marsRover) {
		this.marsRover = marsRover;
	}
	
	public void communicationInstructionsOfVehicle() {
		System.out.println("Enter in the Instructions of the Vehicle"); 
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
