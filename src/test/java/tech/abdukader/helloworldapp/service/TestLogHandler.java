package tech.abdukader.helloworldapp.service;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class TestLogHandler extends Handler {

	private final StringBuilder log = new StringBuilder();

	@Override
	public void close() throws SecurityException {
	}

	@Override
	public void flush() {
	}

	@Override
	public void publish(LogRecord record) {
		log.append(record.getMessage()).append("\n");

	}

	public boolean checkLogContains(String message) {
		return log.toString().contains(message);
	}

}
