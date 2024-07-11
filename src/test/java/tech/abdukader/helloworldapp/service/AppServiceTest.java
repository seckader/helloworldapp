package tech.abdukader.helloworldapp.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppServiceTest {

	private static final Logger LOG = Logger.getLogger(AppService.class.getName());
	private TestLogHandler testLogHandler;

	@BeforeEach
	void setUp() {
		testLogHandler = new TestLogHandler();
		LOG.addHandler(testLogHandler);
	}

	@AfterEach
	void tearDown() {
		LOG.removeHandler(testLogHandler);
	}

	@Test
	void testSayHelloWorld() {
		AppService.sayHelloWorld();

		assertTrue(testLogHandler.checkLogContains("Hello World !!"));
	}

}
