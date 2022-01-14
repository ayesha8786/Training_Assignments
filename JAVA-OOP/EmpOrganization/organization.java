package EmpOrganization;

public class organization
{
	public static void main(String[] args)
	{
		manager m1=new manager("ayesha",20000,2000);
		System.out.println("Total Salary of manager is:"+m1.getsalary());
		labour l1=new labour("bob",20000,1500);
		System.out.println("Total salary of labour is:"+l1.getsalary());
	}
}