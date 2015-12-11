package es.santy.datetime.test;

import java.time.ZoneId;

import org.apache.log4j.Logger;
import org.junit.Test;

public class TimeZoneTest
{
	private static final Logger LOG = Logger.getLogger(TimeZoneTest.class);

	@Test
	public void usingTimeZonesRepresentedByZoneIdTest()
	{
		LOG.info("ZoneId availables: ");

		for (String timezone : ZoneId.getAvailableZoneIds())
		{
			ZoneId zoneId = ZoneId.of(timezone);
			LOG.info("[" + zoneId + "] :: " + zoneId.getRules());
		}

	}
}
