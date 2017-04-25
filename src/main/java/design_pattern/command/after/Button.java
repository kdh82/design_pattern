package design_pattern.command.after;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}
	
	public void pressed(){
		theCommand.execute();
	}
}
