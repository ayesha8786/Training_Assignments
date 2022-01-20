package Bank;

public class SavingsAccount extends bank {
	int depositamnt;
	public SavingsAccount(String name,int amount,int depositamnt)
	{
		super(name,amount);
		this.depositamnt=depositamnt;
	}
	int getfixeddeposit()
	{
		return(super.getfixeddeposit()+depositamnt);
	}

}