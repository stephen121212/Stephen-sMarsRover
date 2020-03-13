public class RoverOnState extends State{
    private Rover rover;

    public RoverOnState(Rover rover){
        this.rover = rover;
    }

    @Override
    public void handleRequest(){
        System.out.println("Rover has been turned on to start moving.");
        rover.setState(rover.getRoverOnState());
    }

    public String toString(){
        return "Rover is currently inactive.";
    }
}