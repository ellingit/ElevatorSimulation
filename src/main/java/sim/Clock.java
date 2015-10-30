package sim;

public class Clock {
	
	private int elapsed;
	
	public int getElapsed(){
		return elapsed;
	}
	public void incrementClock(int ticks){
		elapsed += ticks;
	}
}