public interface Rover(){
    int[] getCoordinates();
    String getDirection();
    void setCoordinates();
    void setDirection();
    void turnLeft();
    void turnRight();
    void moveForward();
}