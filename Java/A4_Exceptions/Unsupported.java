package exception_handling;

import java.util.Scanner;

public class Unsupported {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the first number:");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number");
			int num2 = sc.nextInt();
			int div = num1 / num2;
			System.out.println("The solution is : " + div);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Divide by zero is an runtime error");
		}
		throw new UnsupportedOperationException("Invalid");
	}
}
