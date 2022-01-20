package Lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperCase {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
		System.out.println(alphabets);
		alphabets.replaceAll(e -> e.toUpperCase());
		System.out.println("UpperCase: " + alphabets);

	}

}
