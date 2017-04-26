package design_pattern.factory.after;

public class ThroughputScheduler  implements ElevatorScheduler{
	
	private static final ThroughputScheduler instance = new ThroughputScheduler();
	
	public static ThroughputScheduler getInstance() {
		return instance;
	}

	private ThroughputScheduler() {}

	@Override
	public int selectElevator(ElevatorManager manager, int destination, Direction direction){
		return (int)(Math.random()*3);
	}

	@Override
	public String toString() {
		return "ThroughputScheduler " + Integer.toHexString(hashCode());
	}
	
	
}
