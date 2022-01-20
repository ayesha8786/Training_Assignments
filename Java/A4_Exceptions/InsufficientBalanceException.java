package exception_handling.banking;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String str) {
		System.out.println(str);
	}

}
