package generics;

public class Employee {
	int id;
	String name, department;
	double sal;

	public Employee(int id, String name, String department, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public void Displaydetails() {
		System.out.println(id + " " + name + " " + department + " " + sal);
	}
}
