package Lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class Inbuilt {
	public static void main(String[] args) {
		String name = "john";
		display(() -> name + " is a Student");
		display(() -> name + " is a Employee");

		Consumer<Inbuilt> address = n -> n.enter("Ayesha"); // consumer inbuilt
		Inbuilt i = new Inbuilt();
		address.accept(i);

		Predicate<String> isALongWord = t -> t.length() > 10; // predicate inbuilt
		String s = "successfully";
		boolean result = isALongWord.test(s);
		System.out.println(result);
	}

	private Object enter(String string) {

		return null;
	}

	static void display(Supplier<String> a) // supplier method
	{
		System.out.println(a.get());
	}

	static void display(String s) // consumer method
	{
		System.out.println(s);
	}

}
