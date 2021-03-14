package testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class OnemoreTest {




	Logger log = LogManager.getLogger(OnemoreTest.class);
	@Test
	public void bc(String name) {
		System.out.println("name");
		log.debug("this is debug massage");
		log.error("");
		log.warn("");
		log.fatal("");
		log.info("");
		log.trace("");

	}

	@Test
	public void mn(String name) {
		System.out.println("name");


	}

}
