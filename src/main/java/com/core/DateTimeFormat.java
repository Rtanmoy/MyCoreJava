package com.core;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {

	public static void main(String[] args) {

		 DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a z");
		LocalDateTime date=LocalDateTime.now();
		System.out.println(date);
		
		ZoneId zoneId=ZoneId.of("Asia/Kolkata");
		ZoneId zoneIdUK=ZoneId.of("Europe/London");
		
		ZonedDateTime zonedDateTime=date.atZone(zoneId);
		
		ZonedDateTime timeUK = zonedDateTime.withZoneSameInstant(zoneIdUK);
		System.out.println(dateTimeFormatter.format(zonedDateTime));
		System.out.println(dateTimeFormatter.format(timeUK));

	}

}
