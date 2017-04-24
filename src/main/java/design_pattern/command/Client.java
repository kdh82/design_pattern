package design_pattern.command;

public class Client {
	public static void main(String[] args) {
		Lamp theLamp =new Lamp();
		Button lampButton = new Button(theLamp);
		lampButton.pressed();
	}
}
