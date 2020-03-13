public class RoverOnState extends State{
    private Rover rover;

    public RoverOnState(Rover rover){
        this.rover = rover;
    }

    @Override
    public void handleRequest(){
        System.out.println("Rover has been turned on, in order to start moving.");
        rover.setState(rover.getRoverOffState());
    }

    public String toString(){
        return "Rover is currently active.";
    }
}