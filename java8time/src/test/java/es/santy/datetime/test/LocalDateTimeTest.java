package es.santy.datetime.test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Assert;
import org.junit.Test;

public class LocalDateTimeTest
{

	private static final Logger LOG = Logger.getLogger(LocalDateTimeTest.class);

	@Test
	public void compareLocalDateTimeVersusJodaDateTimeTest()
	{
		DateTime jodaDateTime = DateTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();

		LOG.info("Joda DateTime");
		LOG.info(jodaDateTime);
		LOG.info("Actual TimeZone is " + jodaDateTime.getZone().toString());
		LOG.info(jodaDateTime.withZone(DateTimeZone.forID("Asia/Kolkata")));
		LOG.info("");
		LOG.info("Java 8 API Time");
		LOG.info("A date-time without a time-zone in the ISO-8601 calendar system, such as 2007-12-03T10:15:30.");
		Clock systemUTC = Clock.systemUTC();
		LocalDateTime localDateTimeUTC = LocalDateTime.now(systemUTC);
		LOG.info("UTC " + localDateTimeUTC);
		LOG.info("local " + localDateTime);

		LOG.info("29 March 2015 DST Change");
		ZonedDateTime dstChange = LocalDateTime.of(2015, 3, 29, 0, 0).atZone(ZoneId.of("Europe/Madrid"));
		LOG.info("Offset: " + dstChange.getOffset());
		while (dstChange.getDayOfMonth() == 29)
		{
			LOG.info(dstChange);
			dstChange = dstChange.plusHours(1);
		}

		Assert.assertNotNull(localDateTime);
	}

	@Test
	public void getOffsetInJava8ApiTimeTest()
	{
		ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of("CET"));
		LOG.info(zonedDateTime.getOffset());
		Assert.assertTrue(zonedDateTime.getOffset().getTotalSeconds() == 3600);
	}
}
