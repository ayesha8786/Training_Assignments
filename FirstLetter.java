package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FirstLetter {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Good Morning");
		words.add("Hello");
		words.add("Welcome");
		words.add("Capg");
		words.add("Ayesha");
		Consumer<String> print = (str) -> System.out.println("The first letter of word:" + str.charAt(0));
		words.forEach(print);

	}
}
