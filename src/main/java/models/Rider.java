package models;

public class Rider {
	
	private int currentFloor;
	private int desiredFloor;
	
	public Rider(int currentFloor, int desiredFloor){
		this.currentFloor = currentFloor;
		this.desiredFloor = desiredFloor;
	}

	public int getCurrentFloor(){
		return currentFloor;
	}
	public void setCurrentFloor(int floor){
		currentFloor = floor;
	}
	public int getDesiredFloor(){
		return desiredFloor;
	}
	public void setDesiredFloor(int desiredFloor){
		this.desiredFloor = desiredFloor;
	}
}
