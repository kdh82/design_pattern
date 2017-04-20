package design_pattern.ch03;

import org.junit.Test;

import design_pattern.strategy.Atom;
import design_pattern.strategy.Robot;
import design_pattern.strategy.TaekwonV;

public class TestStrategy {

	@Test
	public void test() {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		prnRobot(taekwonV);
		prnRobot(atom);
	}

	private void prnRobot(Robot robot) {
		System.out.printf("My name is %s%n", robot.getName());
		robot.move();
		robot.attack();
	}

}
