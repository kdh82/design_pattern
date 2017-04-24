package design_pattern.ch03;

import org.apache.log4j.Logger;
import org.junit.Test;

import design_pattern.singleton.after.thread.UserThread;

public class TestSingletonThread {
	private static final Logger log = Logger.getLogger(TestSingletonThread.class);
	
	@Test
	public void testSingletonBeforeThread() {
		UserThread[] user = new UserThread[5];
		
		for(int i=0; i<user.length; i++){
			user[i] = new UserThread((i+1) + "-User");
			log.debug(user[i].toString());
			user[i].start();
		}
	}

}
