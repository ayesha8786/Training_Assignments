package assignment;

import java.util.Scanner;

public class Interest_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		double principal = sc.nextDouble();

		System.out.print("Enter the rate: ");
		double rate = sc.nextDouble();

		System.out.print("Enter the time: ");
		double time = sc.nextDouble();

		System.out.print("Enter number of times interest is compounded: ");
		int number = sc.nextInt();

		double Pinterest = (principal * time * rate) / 100;
		double Cinterest = principal * (Math.pow((1 + rate / 100), (time * number))) - principal;
		
		System.out.println("Principal Interest: " + Pinterest);
		System.out.println("Compound Interest: " + Cinterest);

	}
}
