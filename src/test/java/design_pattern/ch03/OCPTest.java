package design_pattern.ch03;

import org.junit.Test;

import design_pattern.ch03.TimeReminder;

public class OCPTest {

	@Test
	public void testFakeTimeProvider() {
		System.out.println("testFakeTimeProvider()");
		TimeProvider tProvSub = new FakeTimeProvider();
		tProvSub.setHours(23);
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
	}

	@Test
	public void testRealTimeProvider() {
		System.out.println("testRealTimeProvider()");
		TimeProvider tProvSub = new RealTimeProvider();
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
	}
}
