public class RoverFactory {
    public Rover getRover(String roverType){
       switch(roverType){
           case "MARSROVER": return new MarsRover();
           break;
           default: return null;
           break;
       }
    }
 }