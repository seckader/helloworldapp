package tech.abdukader.helloworldapp.service;

import java.util.logging.Logger;

public class AppService {

	private static final Logger LOG = Logger.getLogger(AppService.class.getName());

	public static void sayHelloWorld() {
		LOG.info("Hello World !!");
	}

}
