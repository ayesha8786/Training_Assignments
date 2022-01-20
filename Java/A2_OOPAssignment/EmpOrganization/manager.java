package EmpOrganization;

public class manager extends employee {
	int hourly,incentives;
	manager(String n,int sal,int i)
	{
		super(n,sal);
		incentives=i;
		
		
	}
	int getsalary() {
		return(super.getsalary()+incentives);
	}

}