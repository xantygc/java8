package es.santy.datetime.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneOffsetTransitionRule;
import java.time.zone.ZoneRules;

import org.apache.log4j.Logger;
import org.junit.Test;

public class ZoneOffsetTransitionTest
{
	private static final Logger LOG = Logger.getLogger(ZoneOffsetTransitionTest.class);

	@Test
	public void readZoneOffsetTransitionTest()
	{
		ZonedDateTime dateTime = ZonedDateTime.of(2015, 12, 11, 0, 0, 0, 0, ZoneId.of("Europe/Madrid"));

		LOG.info(dateTime.getOffset().getRules());

		ZoneRules zoneRules = dateTime.getZone().getRules();

		zoneRules.isFixedOffset();

		LOG.info("Instant: " + dateTime.toInstant());

		for (ZoneOffsetTransitionRule rule : dateTime.getZone().getRules().getTransitionRules())
		{
			LOG.info("rule: " + rule + " at " + rule.getLocalTime());
			;
		}

	}
}
