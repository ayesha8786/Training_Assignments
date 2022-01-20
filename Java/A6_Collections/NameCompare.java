package collections;

import java.util.Comparator;

public class NameCompare implements Comparator<EmployeeDetails> {

		public int compare(EmployeeDetails e1, EmployeeDetails e2)
		{
			return e1.getName().compareTo(e2.getName());
		}

	}
