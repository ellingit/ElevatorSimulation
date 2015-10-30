package models;

public class Building {
	
	private int floors;
	private Elevator[] elevators;
	
	public Building(int floors, int elevatorQty){
		this.floors = floors;
		this.elevators = new Elevator[elevatorQty];
	}

	public int getFloors(){
		return floors;
	}
	public int getElevatorQty(){
		return elevators.length;
	}
}
