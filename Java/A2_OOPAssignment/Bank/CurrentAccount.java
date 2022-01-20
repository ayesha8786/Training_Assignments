package Bank;

public class CurrentAccount extends bank {
	int depositedamount;

	public CurrentAccount(String name, int amount, int depositedamount) {
		super(name, amount);
		this.depositedamount = depositedamount;
	}

	int getcashcredit() {
		return (super.getcashcredit() + depositedamount);
	}

}
