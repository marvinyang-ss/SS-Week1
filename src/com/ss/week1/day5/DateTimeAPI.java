/**
 * 
 */
package com.ss.week1.day5;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author marvin
 *
 */
public class DateTimeAPI {
	
	/**
	 * Which class would you use to store your birthday 
	 * in years, months, days, seconds, and nanoseconds?
	 * 
	 * LocalDateTime can store both the date and the time 
	 * of your birthday.
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @param second
	 * @param nanosecond
	 * @return
	 */
	public LocalDateTime getLocalDateTime(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second, Integer nanosecond) {
		return LocalDateTime.of(year, month, day, hour, minute, second, nanosecond);
	}
	
	/**
	 * Given a random date, how would you find the date 
	 * of the previous Thursday?
	 * 
	 * Get the current day of the week and subtract the 
	 * number of days until it is Thursday.
	 * 
	 * @param date
	 * @return
	 */
	public LocalDate previousThursdayOfDate(LocalDate date) {
		Integer minusDays = (3+date.getDayOfWeek().getValue()) % 7;
		if (minusDays == 0) {
			minusDays = 7;
		}
		return date.minusDays(minusDays);
	}
	
	/**
	 * What is the difference between a ZoneId and a ZoneOffset?
	 * (Part 1/2 - What is ZoneId?)
	 * 
	 * ZoneId is the identifier used to represent time zones.
	 * 
	 * @param zoneId
	 * @return
	 */
	public ZonedDateTime getZonedDateTime(LocalDateTime dateTime, ZoneId zoneId) {
		return ZonedDateTime.of(dateTime, zoneId);
	}
	
	/**
	 * What is the difference between a ZoneId and a ZoneOffset?
	 * (Part 2/2 - What is ZoneOffset?)
	 * 
	 * ZoneOffset is used to offset a date-time.
	 * 
	 * @param offset
	 * @return
	 */
	public OffsetDateTime getOffsetDateTime(LocalDateTime dateTime, ZoneOffset offset) {
		return OffsetDateTime.of(dateTime, offset);
	}
	
	/**
	 * How would you convert an Instant to a ZonedDateTime?
	 * 
	 * Use atZone(ZoneId zone) method.
	 * 
	 * @param instant
	 * @return
	 */
	public ZonedDateTime getZonedDateTimeFromInstant(Instant instant) {
		return instant.atZone(ZoneId.systemDefault());
	}
	
	/**
	 * How would you convert a ZonedDateTime to an Instant?
	 * 
	 * Use toInstant() method.
	 * 
	 * @param dateTime
	 * @return
	 */
	public Instant getInstantFromZonedDateTime(ZonedDateTime dateTime) {
		return dateTime.toInstant();
	}
	
	/**
	 * Write an example that, for a given year, reports 
	 * the length of each month within that year.
	 * 
	 * @param year
	 * @return
	 */
	public Integer[] getMonthLengthsOfYear(Integer year) {
		Integer[] monthLengths = new Integer[12];
		for (int i = 0; i < 12; i++) {
			monthLengths[i] = Month.of(i+1).length(Year.isLeap(year));
		}
		return monthLengths;
	}
	
	/**
	 * Write an example that, for a given month of the 
	 * current year, lists all of the Mondays in that month.
	 * 
	 * @param month
	 * @return
	 */
	public List<LocalDate> getMondaysOfMonth(Integer month) {
		List<LocalDate> mondays = new LinkedList<>();
		Month monthObj = Month.of(month);
		Integer monthLength = monthObj.length(Year.now().isLeap());
		Integer day = 1;
		
		while (day <= monthLength) {
			LocalDate date = LocalDate.of(Year.now().getValue(), month, day);
			if (!date.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
				day++;
			} else {
				mondays.add(date);
				day += 7;
			}
		}
		
		return mondays;
	}
	/**
	 * Write an example that tests whether a given date 
	 * occurs on Friday the 13th.
	 * 
	 * @param date
	 * @return
	 */
	public Boolean isFridayThe13th(LocalDate date) {
		if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY) 
				&& date.getDayOfMonth() == 13) {
			return true;
		}
		return false;
	}
	
}
