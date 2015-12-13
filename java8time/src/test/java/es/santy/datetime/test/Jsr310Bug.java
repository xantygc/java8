package es.santy.datetime.test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

import org.junit.Test;

public class Jsr310Bug
{

	@Test
	public void convertToZonedDateTimeExceptionTest()
	{
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneOffset.UTC);
		TemporalAccessor acc = fmt.parse("01/08/2012 00:00:01");
		ZonedDateTime zdt = ZonedDateTime.from(acc);
	}

}
