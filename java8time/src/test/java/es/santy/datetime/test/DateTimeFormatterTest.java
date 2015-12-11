package es.santy.datetime.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.junit.Test;

public class DateTimeFormatterTest
{
	private static final Logger LOG = Logger.getLogger(DateTimeFormatterTest.class);

	@Test
	public void usingLocalTimeWithDateTimeFormatterShortTest()
	{
		LocalTime late = LocalTime.of(23, 59, 59);
		LOG.info(late);

		DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);

		LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
		LOG.info(leetTime);
	}
}
