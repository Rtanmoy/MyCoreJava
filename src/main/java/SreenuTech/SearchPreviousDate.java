package SreenuTech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SearchPreviousDate {

	public static void main(String[] args) {
		DateTimeFormatter format =
	            DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        LocalDateTime now = LocalDateTime.now();
	        LocalDateTime previous = now.minusDays(60);

	        System.out.println(String.format(
	            "Now:  %s\n  Previous: %s",
	            now.format(format),
	            previous.format(format)
	        ));
	}

}
