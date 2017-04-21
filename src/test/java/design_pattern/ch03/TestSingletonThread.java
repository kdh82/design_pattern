package design_pattern.ch03;

import org.junit.Test;

import design_pattern.singleton.after.thread.UserThread;

public class TestSingletonThread {

	@Test
	public void testSingletonBeforeThread() {
		UserThread[] user = new UserThread[5];
		
		for(int i=0; i<user.length; i++){
			user[i] = new UserThread((i+1) + "-User");
			user[i].start();
		}
	}

}
