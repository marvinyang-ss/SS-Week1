package com.ss.week1.day5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTimeAPITest {
	
	private DateTimeAPI api;

	@BeforeEach
	void setUp() throws Exception {
		api = new DateTimeAPI();
	}

	@Test
	void getLocalDateTimeTest() {
		LocalDateTime dateTime = api.getLocalDateTime(1998, 8, 30, 14, 45, 20, 100);
		assertEquals(1998, dateTime.getYear());
		assertEquals(8, dateTime.getMonthValue());
		assertEquals(30, dateTime.getDayOfMonth());
		assertEquals(14, dateTime.getHour());
		assertEquals(45, dateTime.getMinute());
		assertEquals(20, dateTime.getSecond());
		assertEquals(100, dateTime.getNano());
	}

	@Test
	void previousThursdayOfDateTest() {
		LocalDate date = LocalDate.of(2021, 1, 1);
		LocalDate previousThursday = api.previousThursdayOfDate(date);
		assertEquals(2020, previousThursday.getYear());
		assertEquals(12, previousThursday.getMonthValue());
		assertEquals(31, previousThursday.getDayOfMonth());
		
		date = LocalDate.of(2021, 3, 11);
		previousThursday = api.previousThursdayOfDate(date);
		assertEquals(2021, previousThursday.getYear());
		assertEquals(3, previousThursday.getMonthValue());
		assertEquals(4, previousThursday.getDayOfMonth());
	}

	@Test
	void getZonedDateTimeTest() {
		LocalDateTime localDT = LocalDateTime.of(2021, 3, 15, 18, 30);
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zonedDT = api.getZonedDateTime(localDT, zoneId);
		assertEquals(2021, zonedDT.getYear());
		assertEquals(3, zonedDT.getMonthValue());
		assertEquals(15, zonedDT.getDayOfMonth());
		assertEquals(18, zonedDT.getHour());
		assertEquals(30, zonedDT.getMinute());
		assertEquals(zoneId, zonedDT.getZone());
	}

	@Test
	void getOffsetDateTimeTest() {
		LocalDateTime localDT = LocalDateTime.of(2020, 12, 31, 23, 59);
		ZoneOffset offset = ZoneOffset.ofHours(2);
		OffsetDateTime offsetDT = api.getOffsetDateTime(localDT, offset);
		assertEquals(2020, offsetDT.getYear());
		assertEquals(12, offsetDT.getMonthValue());
		assertEquals(31, offsetDT.getDayOfMonth());
		assertEquals(23, offsetDT.getHour());
		assertEquals(59, offsetDT.getMinute());
		assertEquals(offset, offsetDT.getOffset());
	}

	@Test
	void getZonedDateTimeFromInstantTest() {
		ZonedDateTime expectedDateTime = ZonedDateTime.now();
		Instant instant = Instant.now();
		ZonedDateTime testDateTime = api.getZonedDateTimeFromInstant(instant);
		assertEquals(expectedDateTime.getYear(), testDateTime.getYear());
		assertEquals(expectedDateTime.getMonthValue(), testDateTime.getMonthValue());
		assertEquals(expectedDateTime.getDayOfMonth(), testDateTime.getDayOfMonth());
		assertEquals(expectedDateTime.getHour(), testDateTime.getHour());
		assertEquals(expectedDateTime.getMinute(), testDateTime.getMinute());
		assertEquals(expectedDateTime.getSecond(), testDateTime.getSecond());
		assertEquals(expectedDateTime.getZone(), testDateTime.getZone());
		assertEquals(instant.getNano(), testDateTime.getNano());
	}

	@Test
	void getInstantFromZonedDateTimeTest() {
		ZonedDateTime dateTime = ZonedDateTime.now();
		Instant expectedInstant = Instant.now();
		Instant testInstant = api.getInstantFromZonedDateTime(dateTime);
		ZonedDateTime testDateTime = testInstant.atZone(ZoneId.systemDefault());
		assertEquals(dateTime.getYear(), testDateTime.getYear());
		assertEquals(dateTime.getMonthValue(), testDateTime.getMonthValue());
		assertEquals(dateTime.getDayOfMonth(), testDateTime.getDayOfMonth());
		assertEquals(dateTime.getHour(), testDateTime.getHour());
		assertEquals(dateTime.getMinute(), testDateTime.getMinute());
		assertEquals(dateTime.getSecond(), testDateTime.getSecond());
		assertEquals(dateTime.getZone(), testDateTime.getZone());
	}

	@Test
	void getMonthLengthsOfYearTest() {
		Integer[] monthLengths = api.getMonthLengthsOfYear(2021);
		assertEquals(12, monthLengths.length);
		assertEquals(31, monthLengths[0]);
		assertEquals(28, monthLengths[1]);
		assertEquals(31, monthLengths[2]);
		assertEquals(30, monthLengths[3]);
		assertEquals(31, monthLengths[4]);
		assertEquals(30, monthLengths[5]);
		assertEquals(31, monthLengths[6]);
		assertEquals(31, monthLengths[7]);
		assertEquals(30, monthLengths[8]);
		assertEquals(31, monthLengths[9]);
		assertEquals(30, monthLengths[10]);
		assertEquals(31, monthLengths[11]);
	}

	@Test
	void getMondaysOfMonthTest() {
		List<LocalDate> mondays = api.getMondaysOfMonth(1);
		assertEquals(4, mondays.size());
		
		assertEquals(2021, mondays.get(0).getYear());
		assertEquals(1, mondays.get(0).getMonthValue());
		assertEquals(4, mondays.get(0).getDayOfMonth());

		assertEquals(2021, mondays.get(1).getYear());
		assertEquals(1, mondays.get(1).getMonthValue());
		assertEquals(11, mondays.get(1).getDayOfMonth());

		assertEquals(2021, mondays.get(2).getYear());
		assertEquals(1, mondays.get(2).getMonthValue());
		assertEquals(18, mondays.get(2).getDayOfMonth());

		assertEquals(2021, mondays.get(3).getYear());
		assertEquals(1, mondays.get(3).getMonthValue());
		assertEquals(25, mondays.get(3).getDayOfMonth());
	}

	@Test
	void isFridayThe13thTest() {
		LocalDate date = LocalDate.of(2020, 3, 13);
		assertTrue(api.isFridayThe13th(date));
		
		date = LocalDate.of(2020, 1, 13);
		assertFalse(api.isFridayThe13th(date));
		
		date = LocalDate.of(2020, 2, 21);
		assertFalse(api.isFridayThe13th(date));
	}

}
