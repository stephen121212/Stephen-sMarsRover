public class RoverMemento {
    private int[] roverCoordinates;
    private String direction;

    public RoverMemento(int[] roverCoordinates, String direction){
        this.roverCoordinates = roverCoordinates;
        this.direction = direction;
    }

    public int[] getRoverCoordinates(){
        return roverCoordinates;
    }

    public String getRoverDirection(){
        return direction;
    }
}