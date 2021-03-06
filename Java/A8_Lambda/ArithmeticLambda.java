package Lambda;

interface Arithmetic {
	int operation(int a, int b);
}

public class ArithmeticLambda {

	public static void main(String[] args) {

		Arithmetic addition = (int a, int b) -> (a + b);
		System.out.println("Addition = " + addition.operation(8, 16));

		Arithmetic subtraction = (int a, int b) -> (a - b);
		System.out.println("Subtraction = " + subtraction.operation(15, 5));

		Arithmetic multiplication = (int a, int b) -> (a * b);
		System.out.println("Multiplication = " + multiplication.operation(6, 6));

		Arithmetic division = (int a, int b) -> (a / b);
		System.out.println("Division = " + division.operation(24, 6));

	}

}
