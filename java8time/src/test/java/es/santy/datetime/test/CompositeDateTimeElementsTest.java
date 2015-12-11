package es.santy.datetime.test;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.YearMonth;

import org.apache.log4j.Logger;
import org.junit.Test;

public class CompositeDateTimeElementsTest
{

	private static final Logger LOG = Logger.getLogger(CompositeDateTimeElementsTest.class);

	@Test
	public void simpleUsageOfMonthDayTest()
	{
		MonthDay monthDay = MonthDay.now();
		LOG.info(monthDay);
	}

	@Test
	public void simpleUsageofYearMonthTest()
	{
		YearMonth yearMonth = YearMonth.now();
		LOG.info(yearMonth);
	}

	@Test
	public void convertLocalDateTimeToMonthDayTest()
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		YearMonth yearMonth = YearMonth.from(localDateTime);
		LOG.info("YearMonth from " + localDateTime + " is " + yearMonth);
	}
}
