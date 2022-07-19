package loggingEx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingBasics {

	/*
	 * Logback is a logging library used for Java-based applications. It's one of the most
	 * widely used logging frameworks. It replaces another logging library called Log4j.
	 * 
	 * Logback offers fast implementation, more options for configuration, and it offers 
	 * more flexibility in archiving old log files
	 * 
	 * There are 3 classes in logback:
	 * Logger: this is the context for log messages - essentially, this is the class that your program
	 * interacts with to create the log messages.
	 * Appender: places log files in their final destination - we can log to the console, we can log
	 * to a file, you can even log to other destinations like an email; There can be more than one
	 * appender.
	 * Layout: prepares messages from outputting into a particular format, you can also format logs into
	 * html, json, or other formats
	 * 
	 * Logging levels: Error > Warn > Info > Debug > Trace
	 */
	
	private static final Logger Logger = LoggerFactory.getLogger(LoggingBasics.class);
	public static void main(String[] args) {
		
//		Logger.trace("This is a trace log");
//		Logger.debug("This is a debug log");
//		Logger.info("This is an info log");
//		Logger.warn("This is a warn log");
//		Logger.error("This is an error log");
		
		String message = "This is a string";
		int zero = 0;
		
		try {
			Logger.trace("Logging message: {} ", message);
			Logger.info("Let's divide {} by {}. ", 42, zero);
			int result = 42/zero;
			System.out.println(result);
		} catch(Exception e) {
			// I can pass in the exception as the last argument to a logging method, will print
			// the StackTrace
			Logger.trace("Error dividing {} by {}. ", 42, zero, e);
		}
	} // main()
}
