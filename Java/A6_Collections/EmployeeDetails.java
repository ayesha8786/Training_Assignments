package collections;

public class EmployeeDetails {
	private int id;
	private int salary;
	private String name;
	private String department;

	public EmployeeDetails(int id, int salary, String name, String department) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return department;
	}

	public void setDep(String department) {
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

}
