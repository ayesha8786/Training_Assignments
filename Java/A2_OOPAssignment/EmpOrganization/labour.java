package EmpOrganization;

public class labour extends employee {
	int overtime;
	labour(String n,int sal,int ot)
	{
		super(n,sal);
		overtime=ot;
	}
	int getsalary()
	{
		return(super.getsalary()+overtime);
	}

}