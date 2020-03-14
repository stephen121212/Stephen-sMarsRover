package RoverMemento;

import java.util.ArrayDeque;
import java.util.Deque;

import RoverFactory.Rover;

public class CareTaker {
	private Deque<RoverMemento> roverHistory = new ArrayDeque<>();

	public void save(Rover rv) {
		roverHistory.push(rv.save());
	}

	public void revert(Rover rv) {
		rv.revert(roverHistory.pop());
	}
}