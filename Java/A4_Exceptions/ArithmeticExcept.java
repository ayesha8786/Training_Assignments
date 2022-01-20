package exception_handling;
import java.util.Scanner;
public class ArithmeticExcept {

	public static void main(String[] args) {
		
		try {
			int a,b;
			Scanner sc =  new Scanner(System.in);
			System.out.println("Enter the first number ");
			a = sc.nextInt();
			System.out.println("Enter the second number ");
			b = sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handled "+ e);
		}
	}

}