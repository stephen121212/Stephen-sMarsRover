public class CareTaker {
    private Stack<RoverMemento> roverHistory = new Stack<>();

    public void save(Rover rv){
        roverHistory.push(rv.save());
    }

    public void revert(Rover rv){
        rv.revert(employeeHistory.pop());
    }
}