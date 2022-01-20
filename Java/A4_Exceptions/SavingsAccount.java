package exception_handling.banking;

import java.util.Scanner;
import java.io.IOException;
import java.lang.String;

public class SavingsAccount {

	public static void main(String[] args) throws InsufficientBalanceException, IllegalBankTransactionException {

		long id;
		double balance;
		double amount, amount1;
		double withdraw;
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter id");
			id = sc.nextLong();
			System.out.println("Enter balanceamount ");
			balance = sc.nextDouble();
			System.out.println("Enter withdrawlamount");
			amount = sc.nextDouble();

			if ((balance < amount) || ((balance == 0) && (amount > balance))) {
				throw new InsufficientBalanceException("insufficient balance");
			}
			if ((amount < 0) || (balance < amount)) {
				throw new IllegalBankTransactionException("illegal bank transaction");
			}
			System.out.println("the withdrawl amount is" + amount);
			System.out.println("the total balance after withdrawl is" + (balance - amount));
			balance = balance - amount;
			System.out.println("enter deposited amount");
			amount1 = sc.nextDouble();

			System.out.println("the deposited amount is" + amount1);
			System.out.println("the total balance of deposit amount is" + (amount1 + balance));
		}

	}
}
