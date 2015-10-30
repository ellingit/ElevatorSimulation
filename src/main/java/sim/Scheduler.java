package sim;

import models.Building;
import models.Rider;

public class Scheduler {
	
	private Clock clock;
	private Building building;
	private Rider[] riders;
	private int runtime;
	
	public Scheduler(int floors, int elevators, int riders, int runtime){
		building = new Building(floors, elevators);
		this.riders = new Rider[riders];
		this.runtime = runtime;
	}

	public void run(){
		clock = new Clock();
		while(clock.getElapsed() < runtime){
			
		}
	}
}
