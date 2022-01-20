package collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class LeapYear {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.of(1998, 6, 18);
		LocalDate date2 = LocalDate.of(2016, 6, 30);
		LocalDate date3 = LocalDate.of(2019, 10, 3);

		LinkedList<LocalDate> list = new LinkedList<LocalDate>();

		list.add(date1);
		list.add(date2);
		list.add(date3);

		for (LocalDate l : list) {
			String printDate = l.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));

			if (l.isLeapYear()) {
				System.out.println("Your Date of Birth is " + printDate + " and it was a leap year");
			} else {
				System.out.println("Your Date of Birth is " + printDate + " and it was not a leap year");
			}
		}

	}

}
