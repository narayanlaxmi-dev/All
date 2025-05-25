package java_API_enhacementFunctionalProg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSimpleMain {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		LocalDateTime tdayAndNow = LocalDateTime.now();

		System.out.println(today);
		System.out.println(now);
		System.out.println(tdayAndNow);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println("Formatted DateTime: " + tdayAndNow.format(dateTimeFormatter));
	}

}
