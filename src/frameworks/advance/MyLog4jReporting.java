package frameworks.advance;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class MyLog4jReporting {
	
	private static Logger log = Logger.getLogger(MyLog4jReporting.class.getName());
	
	//@Test
	public void testLog4j(){
		
		log.info("my log4j log statement");
		
		log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");
		
		/*
		 *  log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!");
      log.error("Error Message!");
      log.fatal("Fatal Message!");
      
      
      ALL	All levels including custom levels.
DEBUG	Designates fine-grained informational events that are most useful to debug an application.
ERROR	Designates error events that might still allow the application to continue running.
FATAL	Designates very severe error events that will presumably lead the application to abort.
INFO	Designates informational messages that highlight the progress of the application at coarse-grained level.
OFF	The highest possible rank and is intended to turn off logging.
TRACE	Designates finer-grained informational events than the DEBUG.
WARN	Designates potentially harmful situations.
		 */
	}
	
	public static void main(String args[]){
		MyLog4jReporting l = new MyLog4jReporting();
		l.testLog4j();
	}

}
