package java_API_enhacementFunctionalProg;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateOperationMain {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 4, 19);
		System.out.println("day 🫡: " + date);
		LocalDate dateupdated =  date.plus(146, ChronoUnit.DAYS);
		System.out.println("day 😐: "+dateupdated);
	}
}
