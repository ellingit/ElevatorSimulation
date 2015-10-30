package models;

import java.util.PriorityQueue;

public class Elevator {
	
	private int currentFloor;
	private boolean moving;
	private boolean doorOpen;
	private PriorityQueue<Integer> destinations;
	
	public Elevator(){
		currentFloor = 1;
		destinations = new PriorityQueue<Integer>();
	}
	
	public int getCurrentFloor(){
		return currentFloor;
	}
	public boolean isMoving(){
		return moving;
	}
	public boolean isDoorOpen(){
		return doorOpen;
	}
	public void queueDestination(int floor){
		destinations.offer(floor);
	}
}