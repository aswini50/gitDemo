import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	private static final Logger logger = LogManager.getLogger(Log4JDemo.class);
	private static long startTime=System.currentTimeMillis();
		
@Test
public void logInfoMessage()
{
	logger.info("This is an info message for my Log4j Demo for Binaifer ");
	}
@Test
public void logWarningMessage(){
	logger.warn("This is a warning message for Demo with Binaifer ");
}
@Test
public void logErrorMessage(){
	int marks = 5;
	if(marks <= 50)
	{
	logger.error("This is an error message: Binaifer , Marks must be more than 50 ,Too bad");
	}

	long endTime= System.currentTimeMillis();
logger.info("Time taken for execution is " + (endTime-startTime) + "milliseconds");//Checking performance 
}
}
