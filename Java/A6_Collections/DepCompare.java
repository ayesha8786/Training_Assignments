package collections;

import java.util.Comparator;

public class DepCompare implements Comparator<EmployeeDetails> {

	public int compare(EmployeeDetails e1, EmployeeDetails e2) {
		return e1.getDep().compareTo(e2.getDep());
	}

}
