package marsRoverCoordinates;

public class Coords {
	private int x;
	private int y;
	
	public Coords(){
		this.x = 0;
		this.y = 0;
	}
	
	public Coords(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean isNegative() {
		if(x < 0 || y < 0) {
			return true;
		}
		else{
			return false;
		}
	}

	public boolean Compare(Coords coords) {
		if(x > coords.x || y > coords.y) {
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public int moveXByAmount(int amount) {
		 this.x = x + amount;
		 return this.x;
	 }
	 
	 public int moveYByAmount(int amount){
		 this.y = y + amount; 
		 return this.y;
	 }
	 
	 @Override
	 public String toString() {
		 return this.x + " " + this.y;
	 }
}
