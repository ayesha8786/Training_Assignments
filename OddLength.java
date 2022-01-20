package Lambda;

import java.util.ArrayList;

public class OddLength {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("Good Morning");
		words.add("Hello");
		words.add("Welcome");
		words.add("Capg");
		words.add("Analyst");
		words.add("Java");
		words.removeIf(n -> (n.length() % 2 != 0));
		for (String i : words) {
			System.out.println(i);
		}
	}

}
