package collections;

import java.util.Comparator;

public class SalaryCompare implements Comparator<EmployeeDetails> {

	public int compare(EmployeeDetails e1, EmployeeDetails e2) {
		return e1.getSalary() - e2.getSalary();

	}
}
