package collections;

import java.util.Comparator;

public class IdCompare implements Comparator<EmployeeDetails>{
		public int compare(EmployeeDetails e1, EmployeeDetails e2)
		{
			return e1.getId() - e2.getId();
		}
	}

