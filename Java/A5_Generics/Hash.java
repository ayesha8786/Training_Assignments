package generics;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		HashSet<Employee> set = new HashSet<Employee>();
		Employee e = new Employee(1, "Ayesha", "Income Tax",20000);
		set.add(e);
		for (Employee e1 : set) {
			e.Displaydetails();
		}
	}

}
