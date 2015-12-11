package es.santy.datetime.test;

import java.time.Clock;

import org.apache.log4j.Logger;
import org.junit.Test;

public class ClockTest
{
	private static final Logger LOG = Logger.getLogger(ClockTest.class);

	@Test
	public void usingClockInsteadOfSystemCurrentMillisTest()
	{
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();

		LOG.info("Clock:");
		LOG.info("A clock providing access to the current instant, date and time using a time-zone.");
		LOG.info("Clock.systemDefaultZone():");
		LOG.info("This clock is based on the best available system clock. This may use System.currentTimeMillis(), or a higher resolution clock if one is available.");
		LOG.info("Using this method hard codes a dependency to the default time-zone into your application. It is recommended to avoid this and use a specific time-zone whenever possible. The UTC clock should be used when you need the current instant without the date or time.");
		LOG.info("The returned implementation is immutable, thread-safe and Serializable. It is equivalent to system(ZoneId.systemDefault()).");
		LOG.info("Example millis: " + millis + " for " + clock);

	}

}
