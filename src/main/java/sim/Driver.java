package sim;

public class Driver {
	
	public static int floors = 10;
	public static int elevators = 3;
	public static int riders = 500;
	public static int runtime = 10_000;

	public static void main(String[] args) {
		Scheduler egs = new Scheduler(floors, elevators, riders, runtime);
		egs.run();
	}

}
