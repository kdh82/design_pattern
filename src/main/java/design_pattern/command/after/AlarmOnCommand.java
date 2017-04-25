package design_pattern.command.after;

import design_pattern.command.before.Alarm;

public class AlarmOnCommand implements Command {
	private Alarm theAlarm;
	
	
	public AlarmOnCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}


	@Override
	public void execute() {
		theAlarm.start();
	}

}
