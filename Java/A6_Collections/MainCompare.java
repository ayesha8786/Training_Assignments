package collections;

import java.util.Scanner;
import java.util.TreeSet;

public class MainCompare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"You want to sort in order of \n\n1.ID\n2.Name\n3.Department\n4.Salary\n\nEnter your option: ");
		int option = scan.nextInt();

		switch (option) {
		case 1:
			TreeSet<EmployeeDetails> set = new TreeSet<EmployeeDetails>(new IdCompare());

			set.add(new EmployeeDetails(1, 25000, "Ayesha", "A"));
			set.add(new EmployeeDetails(2, 25000, "Swathi", "C"));
			set.add(new EmployeeDetails(3, 25000, "Harika", "F"));

			System.out.println(" Increasing Order with the Id : ");

			for (EmployeeDetails e : set) {
				System.out.print(e.getId() + "," + e.getName() + "," + e.getDep() + "," + e.getSalary());
				System.out.println();
			}

			break;

		case 2:
			TreeSet<EmployeeDetails> setN = new TreeSet<EmployeeDetails>(new NameCompare());

			setN.add(new EmployeeDetails(1, 25000, "Ayesha", "A"));
			setN.add(new EmployeeDetails(2, 25000, "Swathi", "C"));
			setN.add(new EmployeeDetails(3, 25000, "Harika", "F"));
			System.out.println(" Increasing Order with the Name : ");

			for (EmployeeDetails e : setN) {
				System.out.print(e.getId() + "," + e.getName() + "," + e.getDep() + "," + e.getSalary());
				System.out.println();
			}

			break;

		case 3:
			TreeSet<EmployeeDetails> setD = new TreeSet<EmployeeDetails>(new DepCompare());

			setD.add(new EmployeeDetails(1, 25000, "Ayesha", "A"));
			setD.add(new EmployeeDetails(2, 25000, "Swathi", "C"));
			setD.add(new EmployeeDetails(3, 25000, "Harika", "F"));

			System.out.println(" Increasing Order with the Department : ");

			for (EmployeeDetails e : setD) {
				System.out.print(e.getId() + "," + e.getName() + "," + e.getDep() + "," + e.getSalary());
				System.out.println();
			}

			break;

		case 4:
			TreeSet<EmployeeDetails> setS = new TreeSet<EmployeeDetails>(new SalaryCompare());

			setS.add(new EmployeeDetails(1, 25000, "Ayesha", "A"));
			setS.add(new EmployeeDetails(2, 25000, "Swathi", "C"));
			setS.add(new EmployeeDetails(3, 25000, "Harika", "F"));

			System.out.println(" Increasing Order with the Salary : ");

			for (EmployeeDetails e : setS) {
				System.out.print(e.getId() + "," + e.getName() + "," + e.getDep() + "," + e.getSalary());
				System.out.println();
			}

			break;

		}

	}

}
