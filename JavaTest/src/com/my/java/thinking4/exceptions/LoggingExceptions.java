package com.my.java.thinking4.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

@SuppressWarnings("serial")
class LoggingException extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class LoggingExceptions {
    public static void main(String[] args) {
    	LoggingExceptions a = new LoggingExceptions();
    	System.out.println(LoggingExceptions.class.getSimpleName());
    	System.out.println(a.getClass().getSimpleName());
    	
	}
}
