package assignment8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateAPI {

	public static void main(String[] args) {
		 LocalDate startDate = LocalDate.of(2025, 4, 19);
	        LocalDate endDate = LocalDate.of(2025, 9, 12);

	        // calc diff in days
	        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

	        System.out.println("DAYS between: " + daysBetween);
	}

}
