public class MarsRover implements Rover {
    private int[] roverCoordinates;
    private String direction;
    State roverOnState;
    State roverOffState;
    State state;

    public MarsRover(){
        roverOffState = new RoverOffState(this);
        roverOnState = new RoverOnState(this);
        state = roverOffState;
    }

    public MarsRover(int[] roverCoordinates, String direction){
        roverOffState = new RoverOffState(this);
        roverOnState = new RoverOnState(this);
        state = roverOffState;
        this.roverCoordinates = roverCoordinates;
        this.direction = direction;
    }

    @Override
    public String toString(){
        return state.toString();
    }

    public void changeRoverState(){
        state.handleRequest();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getRoverOnState(){
        return roverOnState;
    }

    public State getRoverOffState(){
        return roverOffState;
    }

    @Override
    public int[] getCoordinates(){
        return this.roverCoordinates;
    }

    @Override
    public String getDirection(){
        return this.roverDirection;
    }

    @Override
    public void setCoordinates(int [] roverCoordinates){
        this.roverCoordinates = roverCoordinates;
    }

    @Override
    public void setDirection(String direction){
        this.direction = direction;
    }

    @Override
    public void turnLeft(String currentDirection){
        switch(currentDirection){
            case "N": this.roverDirection = "W";
            break;
            case "E": this.roverDirection = "S";
            break;
            case "S": this.roverDirection = "W";
            break;
            case "W": this.roverDirection = "N";
            break;
            default: return "Error not correct Direction";
        }
    }

    @Override
    public void turnRight(String currentDirection){
        switch(currentDirection){
            case "N": this.roverDirection = "E";
            break;
            case "E": this.roverDirection = "S";
            break;
            case "S": this.roverDirection = "W";
            break;
            case "W": this.roverDirection = "N";
            break;
            default: return "Error not correct Direction";
        }
    }

    @Override
    public void moveForward(int[] currentCoordinates, String currentDirection){
        switch(currentDirection){
            case "N": this.roverDirection = "E";
            break;
            case "E": this.roverDirection = "S";
            break;
            case "S": this.roverDirection = "W";
            break;
            case "W": this.roverDirection = "N";
            break;
            default: return "Error not correct Direction";
        }
    }

    public RoverMemento save(){
        return new RoverMemento(this.roverCoordinates, this.direction);
    }

    public void revert(RoverMemento rv){
        this.roverCoordinates = rv.getRoverCoordinates();
        this.direction = rv.getRoverDirection();
    }
}