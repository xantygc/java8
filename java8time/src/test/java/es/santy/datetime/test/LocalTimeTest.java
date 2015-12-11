package es.santy.datetime.test;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LocalTimeTest
{

	private static final Logger LOG = Logger.getLogger(LocalTimeTest.class);

	@Test
	public void usingLocalTimeTest()
	{
		LocalTime now1 = LocalTime.now(ZoneId.of("UTC"));
		LocalTime now2 = LocalTime.now(Clock.systemDefaultZone());

		LOG.info("now1 is " + now1 + " and now2 is " + now2);

		Assert.assertTrue(now1.isBefore(now2));

		long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
		LOG.info("Hours between now1 and now2 " + hoursBetween);

		long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
		LOG.info("Minutes between now1 and now2 " + minutesBetween);

		long secondsBetween = ChronoUnit.SECONDS.between(now1, now2);
		LOG.info("Seconds between now1 and now2 " + secondsBetween);

		long nanoSecondsBetween = ChronoUnit.NANOS.between(now1, now2);
		LOG.info("Nano seconds between now1 and now2 " + nanoSecondsBetween);

	}
}
