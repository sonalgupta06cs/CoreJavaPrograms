/**
 * 
 */
package com.java.java8Features.DateTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Set;

/**
 * 
 * Before Java 8, a.) Date class was there in 2 packages sql n util b.)
 * java.text, which had all formatting issues. c.) All Date classes were not
 * thread safe, if there are multiple threads are working on the date object, if
 * 1 thread is making any change , other thread will suffer.
 * 
 * From Java 8, a.) Date API is immutable, you can't make any change to its
 * value, even if you make it will create a new object for you.
 * 
 * 
 * @author SonaSach
 *
 */
public class DateTimeAPIDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate birthDate = LocalDate.of(1988, Month.OCTOBER, 25);
		System.out.println(birthDate);

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		Set<String> zones = ZoneId.getAvailableZoneIds();
		//zones.forEach(zoneid -> System.out.println(zoneid));
		

		LocalTime zoneTime = LocalTime.now(ZoneId.of("Singapore"));
		System.out.println(zoneTime);
		
		// GMT Date n Time
		Instant instant = Instant.now();
		System.out.println(instant);

	}

}
